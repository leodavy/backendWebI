package com.backendwebi.backendwebi.service;

import com.backendwebi.backendwebi.model.TorneioModel;
import com.backendwebi.backendwebi.model.UsuarioModel;
import com.backendwebi.backendwebi.repository.TorneioRepository;
import jakarta.transaction.Transactional;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.Date;
import java.util.List;

@Service
@RequiredArgsConstructor
public class TorneioService {
    private final TorneioRepository torneioRepository;

    @Transactional
    public void cadastrar(TorneioModel torneioModel){
        torneioRepository.save(torneioModel);
    }
    public List<TorneioModel> listarTodosTorneios(){
        return torneioRepository.findAll();
    }
}
