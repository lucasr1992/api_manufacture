package com.azuremyst.manutencao.domain;

import lombok.Data;
import lombok.EqualsAndHashCode;

import javax.persistence.*;

@Data
@EqualsAndHashCode(onlyExplicitlyIncluded = true)
@Entity(name = "tb_Planta")
public class Planta {
    @Id
    @EqualsAndHashCode.Include
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(nullable = false)
    private String planta;

    @Column(nullable = false)
    private String regiao;

    @Column(nullable = false)
    private String pais;

    @Column(nullable = false)
    private String status;

    @OneToOne
    @JoinColumn(nullable = false)
    private UnidadeNegocio unidade;
}
