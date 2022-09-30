package com.azuremyst.manutencao.domain;


import lombok.Data;
import lombok.EqualsAndHashCode;

import javax.persistence.*;
import java.time.LocalDateTime;

@Data
@EqualsAndHashCode(onlyExplicitlyIncluded = true)
@Entity(name = "tb_Colaborador")
public class Colaborador extends Pessoa{

    @Id
    @EqualsAndHashCode.Include
    private String registro;

    @ManyToOne
    @JoinColumn
    private Especialidade especialidade;

    @ManyToOne
    @JoinColumn(nullable = false)
    private Turno turno;

    @ManyToOne
    @JoinColumn(nullable = false)
    private Area area;

    @Column(nullable = false)
    private String senha;

    @ManyToOne
    @JoinColumn(nullable = false)
    private Cargo cargo;

    private LocalDateTime dataDesativacao;







}
