package com.backendwebi.backendwebi.repository;

import com.backendwebi.backendwebi.model.InscricaoModel;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface InscricaoRepository extends JpaRepository<InscricaoModel, Integer> {
    @Query("SELECT ins, ins.catNrId, ins.usuNrId1, ins.usuNrId2 FROM InscricaoModel ins " +
            "WHERE ins.catNrId.catNrId = :catNrId")
    List<InscricaoModel> listarInscritosCategoria(@Param("catNrId") int catNrId);
}
