package com.backendwebi.backendwebi.model;

import jakarta.persistence.*;
import jakarta.validation.constraints.NotNull;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name = "ins_inscricao", schema = "public")
public class InscricaoModel {

    @NotNull
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "ins_nr_id")
    private int insNrId;

    @NotNull
    @ManyToOne
    @JoinColumn(name = "usu_nr_id1")
    private UsuarioModel usuNrId1;

    @NotNull
    @ManyToOne
    @JoinColumn(name = "usu_nr_id2")
    private UsuarioModel usuNrId2;

    @NotNull
    @ManyToOne
    @JoinColumn(name = "cat_nr_id")
    private CategoriaModel catNrId;

}
