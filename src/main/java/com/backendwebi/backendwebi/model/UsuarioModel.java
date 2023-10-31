package com.backendwebi.backendwebi.model;

import jakarta.persistence.*;
import jakarta.validation.constraints.NotNull;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import java.util.Date;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name = "usu_usuario", schema = "public")
public class UsuarioModel {

    @NotNull
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "usu_nr_id")
    private int usuNrId;

    @NotNull
    @Column(name = "usu_tx_nome")
    private String usuTxNome;

    @NotNull
    @Column(name = "usu_tx_login")
    private String usuTxLogin;

    @NotNull
    @Column(name = "usu_tx_senha")
    private String usuTxSenha;


    @Column(name = "usu_dt_cadastro")
    private Date usuDtCadastro;
}
