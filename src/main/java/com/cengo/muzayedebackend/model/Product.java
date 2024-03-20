package com.cengo.muzayedebackend.model;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;

@Entity
@Table(name = "products")
@EnableAutoConfiguration
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
public class Product {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "product_id")
    private Long id;

    @Column(name = "artist_id")
    private Long artistId;

    @Column(name = "buyer_id")
    private Long buyerId;

    @Column(name = "name")
    private String name;

    @Column(name = "info")
    private String info;

    @Column(name = "price")
    private Double price;

    @Column(name = "state")
    @Enumerated(EnumType.ORDINAL)
    private State state;

    @Column(name = "category")
    private String category; //?????

}
