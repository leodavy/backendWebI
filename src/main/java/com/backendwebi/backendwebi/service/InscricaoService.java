package com.backendwebi.backendwebi.service;

import com.backendwebi.backendwebi.model.CategoriaModel;
import com.backendwebi.backendwebi.model.InscricaoModel;
import com.backendwebi.backendwebi.model.UsuarioModel;
import com.backendwebi.backendwebi.repository.CategoriaRepository;
import com.backendwebi.backendwebi.repository.InscricaoRepository;
import com.backendwebi.backendwebi.repository.UsuarioRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
@RequiredArgsConstructor
public class InscricaoService {
    private final InscricaoRepository inscricaoRepository;
    private final UsuarioRepository usuarioRepository;
    private final CategoriaRepository categoriaRepository;

    public InscricaoModel realizarInscricaoTorneio(int usuNrId1, int usuNrId2, int catNrId){
        Optional<UsuarioModel> usuarioModel1 = usuarioRepository.findById(usuNrId1);
        Optional<UsuarioModel> usuarioModel2 = usuarioRepository.findById(usuNrId2);
        Optional<CategoriaModel> categoriaModel = categoriaRepository.findById(catNrId);

        InscricaoModel inscricaoModel = new InscricaoModel();
        if(usuarioModel1.isPresent() && usuarioModel2.isPresent() && categoriaModel.isPresent()){
            inscricaoModel.setUsuNrId1(usuarioModel1.get());
            inscricaoModel.setUsuNrId2(usuarioModel2.get());
            inscricaoModel.setCatNrId(categoriaModel.get());

            return inscricaoRepository.save(inscricaoModel);
        } else {
            System.out.println("Usuário ou categoria não encontrado");
        }
        return inscricaoRepository.save(inscricaoModel);
    }
}
