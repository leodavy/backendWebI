package com.backendwebi.backendwebi.repository;

import com.backendwebi.backendwebi.model.TorneioModel;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface TorneioRepository  extends JpaRepository<TorneioModel, Integer> {
}
