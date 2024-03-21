package com.cengo.muzayedebackend.model;


import jakarta.persistence.*;
import lombok.*;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.format.annotation.DateTimeFormat;

import java.time.LocalDate;
import java.util.Date;
import java.util.List;

@Entity
@Table(name = "users")
@EnableAutoConfiguration
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
public class User {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "name")
    private String name;

    @Column(name = "surname")
    private String surname;

    @Column(name = "email", unique = true)
    private String email;

    @Column(name = "password")
    private String password;

    @Column(name = "phone", unique = true)
    private String phone;

    @Column(name = "address")
    private String address;

    @Column(name = "birth_date")
    @DateTimeFormat(pattern = "dd/MM/yyyy")
    private LocalDate birthDate;

    @Column(name = "approved")
    private Boolean approved = false;

    @OneToMany(fetch = FetchType.LAZY)
    @JoinColumn(name = "buyer_id")
    private List<Product> purchasedProducts;

    @OneToMany(fetch = FetchType.LAZY)
    @JoinColumn(name = "buyer_id")
    private List<AuctionProduct> purchasedAuctionProducts;
}
