package com.cengo.muzayedebackend.model;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;

import java.util.ArrayList;
import java.util.List;

@Entity
@Table(name = "auction_products")
@EnableAutoConfiguration
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
public class AuctionProduct {

    @Id
    @Column(name = "auction_product_id")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "artist_id")
    private Long artistId;

    @Column(name = "auction_id")
    private Long auctionId;

    @Column(name = "buyer_id")
    private Long buyerId;

    @Column(name = "name")
    private String name;

    @Column(name = "description")
    private String description;

    @Column(name = "image_url")
    private String imageUrl; //ElementCollection yapılabilir

    @Column(name = "initial_price")
    private Double initialPrice;

    @Column(name = "final_price")
    private Double finalPrice;

    @Column(name = "state")
    @Enumerated(EnumType.ORDINAL)
    private State state;

}
