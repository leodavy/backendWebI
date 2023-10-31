package com.backendwebi.backendwebi.repository;

import com.backendwebi.backendwebi.model.UsuarioModel;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface UsuarioRepository extends JpaRepository<UsuarioModel, Integer> {
    @Query(nativeQuery = true, value = "select * from public.usu_usuario where usu_tx_nome =:nome")
    List<UsuarioModel> encontrarUsuarioPeloNome(@Param("nome") String nome);
    UsuarioModel findByUsuTxLogin(String usuTxLogin);

}
