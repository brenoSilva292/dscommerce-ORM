package com.devsuperior.dscommerce.entities;

import jakarta.persistence.*;

import java.time.Instant;

@Entity //Mapeamento do JPA
@Table(name = "tb_order") //Customizar nome da tabela no banco
public class Order {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY) //Para ser auto incremented no banco
    private Long id;

    @Column(columnDefinition = "TIMESTAMP WITHOUT TIME ZONE") //Com um instante no TEMPO
    private Instant moment;
    private OrderStatus status;

    @ManyToOne
    @JoinColumn(name = "client_id")
    private User client;
}
