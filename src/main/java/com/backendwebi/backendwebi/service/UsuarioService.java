package com.backendwebi.backendwebi.service;

import com.backendwebi.backendwebi.model.UsuarioModel;
import com.backendwebi.backendwebi.repository.UsuarioRepository;
import jakarta.transaction.Transactional;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.Date;
import java.util.List;
import java.util.Optional;

@Service
@RequiredArgsConstructor
public class UsuarioService {

    private final UsuarioRepository usuarioRepository;
    @Transactional
    public void cadastrar(UsuarioModel usuarioModel){
        usuarioModel.setUsuDtCadastro(new Date());
        usuarioRepository.save(usuarioModel);
    }
    public boolean autenticarUsuario(String usuTxLogin, String usuTxSenha) {
        UsuarioModel usuario = usuarioRepository.findByUsuTxLogin(usuTxLogin);
        return usuario != null && usuario.getUsuTxSenha().equals(usuTxSenha);
    }
    public List<UsuarioModel> listarTodosUsuarios(){
        return usuarioRepository.findAll();
    }
    public Optional<UsuarioModel> encontrarUsuarioPeloId(int id){
        return usuarioRepository.findById(id);
    }
    public List<UsuarioModel> encontrarUsuarioPeloNome(String nome){
        return usuarioRepository.encontrarUsuarioPeloNome(nome);
    }
}
