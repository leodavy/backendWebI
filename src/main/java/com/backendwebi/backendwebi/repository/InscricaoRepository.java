package com.backendwebi.backendwebi.repository;

import com.backendwebi.backendwebi.model.InscricaoModel;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface InscricaoRepository extends JpaRepository<InscricaoModel, Integer> {
}
