package com.backendwebi.backendwebi.repository;

import com.backendwebi.backendwebi.model.CategoriaModel;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface CategoriaRepository extends JpaRepository<CategoriaModel, Integer> {
    List<CategoriaModel> findAllByTorNrId_TorNrId(int torNrId);
}
