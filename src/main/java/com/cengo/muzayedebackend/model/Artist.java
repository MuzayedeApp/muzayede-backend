package com.cengo.muzayedebackend.model;

import com.cengo.muzayedebackend.model.base.BaseEntity;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.List;

@Entity
@Table(name = "artist")
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
public class Artist extends BaseEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private Long id;

    @Column(name = "full_name")
    private String fullName;

    @Column(name = "info")
    private String info;

    @OneToMany(fetch = FetchType.LAZY)
    @JoinColumn(name = "artist_id")
    private List<AuctionProduct> auctionProducts;

    @OneToMany(fetch = FetchType.LAZY)
    @JoinColumn(name = "artist_id")
    private List<Product> products;

}
