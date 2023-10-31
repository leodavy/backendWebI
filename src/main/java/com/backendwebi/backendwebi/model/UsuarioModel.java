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
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "usu_nr_id")
    private int usuNrId;
    @Column(name = "usu_tx_nome")
    @NotNull
    private String usuTxNome;
    @Column(name = "usu_tx_login")
    @NotNull
    private String usuTxLogin;
    @Column(name = "usu_tx_senha")
    @NotNull
    private String usuTxSenha;
    @Column(name = "usu_dt_cadastro")
    private Date usuDtCadastro;
}
