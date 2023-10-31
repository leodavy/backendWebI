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
@Table(name = "tor_torneio", schema = "public")
public class TorneioModel {

    @NotNull
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "tor_nr_id")
    private int torNrId;

    @NotNull
    @Column(name = "tor_tx_nome")
    private String torTxNome;
}
