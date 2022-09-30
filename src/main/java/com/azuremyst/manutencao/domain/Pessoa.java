package com.azuremyst.manutencao.domain;

import lombok.Data;

import java.time.LocalDateTime;

@Data
public abstract class Pessoa {

    private String nome;
    private String email;
    private LocalDateTime dataCadastro;
    private String status;



}
