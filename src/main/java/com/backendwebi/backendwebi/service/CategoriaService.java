package com.backendwebi.backendwebi.service;

import com.backendwebi.backendwebi.model.CategoriaModel;
import com.backendwebi.backendwebi.model.TorneioModel;
import com.backendwebi.backendwebi.repository.CategoriaRepository;
import com.backendwebi.backendwebi.repository.TorneioRepository;
import jakarta.transaction.Transactional;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
@RequiredArgsConstructor
public class CategoriaService {
    private final CategoriaRepository categoriaRepository;
    private final TorneioRepository torneioRepository;
    @Transactional
    public CategoriaModel cadastrar(int torNrId, CategoriaModel categoriaModel){
        Optional<TorneioModel> torneioModel = torneioRepository.findById(torNrId);
        if(torneioModel.isPresent()){
            TorneioModel torneio = torneioModel.get();
            categoriaModel.setTorNrId(torneio);
            return categoriaRepository.save(categoriaModel);
        } else {
            System.out.println("Torneio com ID " + torNrId + " não encontrado.");
        }
        return categoriaRepository.save(categoriaModel);
    }
}
