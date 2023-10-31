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
@Table(name = "cat_categoria", schema = "public")
public class CategoriaModel {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "cat_nr_id")
    private int catNrId;

    @ManyToOne
    @JoinColumn(name = "tor_nr_id")
    private TorneioModel torNrId;

    @Column(name = "cat_tx_nome")
    @NotNull
    private String catTxNome;

}
