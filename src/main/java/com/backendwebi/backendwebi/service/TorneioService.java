package com.backendwebi.backendwebi.service;

import com.backendwebi.backendwebi.model.CategoriaModel;
import com.backendwebi.backendwebi.model.TorneioModel;
import com.backendwebi.backendwebi.repository.CategoriaRepository;
import com.backendwebi.backendwebi.repository.TorneioRepository;
import jakarta.transaction.Transactional;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;


import java.util.List;
import java.util.Optional;

@Service
@RequiredArgsConstructor
public class TorneioService {
    private final TorneioRepository torneioRepository;
    private final CategoriaRepository categoriaRepository;

    @Transactional
    public void cadastrar(TorneioModel torneioModel){
        torneioRepository.save(torneioModel);
    }
    public List<TorneioModel> listarTodosTorneios(){
        return torneioRepository.findAll();
    }
    public Optional<TorneioModel> buscarTorneioPorId(int torNrId){
        return torneioRepository.findById(torNrId);
    }

    public List<CategoriaModel> listarCategoriasTorneio(int torNrId){
        return categoriaRepository.findAllByTorNrId_TorNrId(torNrId);
    }

}
