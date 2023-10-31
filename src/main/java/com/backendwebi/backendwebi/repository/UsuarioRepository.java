package com.backendwebi.backendwebi.repository;

import com.backendwebi.backendwebi.model.UsuarioModel;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface UsuarioRepository extends JpaRepository<UsuarioModel, Integer> {

    UsuarioModel findByUsuTxLogin(String usuTxLogin);
    UsuarioModel findByUsuTxNome(String usuTxNome);

}
