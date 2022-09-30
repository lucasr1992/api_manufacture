package com.azuremyst.manutencao.domain;


import lombok.Data;
import lombok.EqualsAndHashCode;

import javax.persistence.*;

@Data
@EqualsAndHashCode(onlyExplicitlyIncluded = true)
@Entity(name = "tb_Area")
public class Area {
    @Id
    @EqualsAndHashCode.Include
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(nullable = false)
    private String area;

    @Column(nullable = false)
    private String centroCusto;

    @OneToOne
    @JoinColumn(nullable = false)
    private Planta planta;

    @Column(nullable = false)
    private String status;
}
