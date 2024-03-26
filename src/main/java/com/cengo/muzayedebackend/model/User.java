package com.cengo.muzayedebackend.model;


import com.cengo.muzayedebackend.model.base.BaseEntity;
import com.fasterxml.jackson.annotation.JsonFormat;
import jakarta.persistence.*;
import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Past;
import lombok.*;

import java.time.LocalDate;
import java.util.List;

@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@Entity
@Table(name = "users")
public class User extends BaseEntity {

    @SequenceGenerator(name = "User", sequenceName = "USER_ID_SEQ")
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "User")
    @Id
    private Long id;

    @NotBlank
    @Column(name = "NAME", nullable = false)
    private String name;

    @NotBlank
    @Column(name = "USERNAME", nullable = false)
    private String surname;

    @Email
    @NotBlank
    @Column(name = "EMAIL", unique = true, nullable = false)
    private String email;

    @NotBlank
    @Column(name = "PASSWORD", nullable = false)
    private String password;

    @NotBlank
    @Column(name = "PHONE", unique = true, nullable = false)
    private String phone;

    @NotBlank
    @Column(name = "ADDRESS", nullable = false)
    private String address;

    @Past
    @NotNull
    @JsonFormat(pattern = "dd-MM-yyyy")
    @Column(name = "BIRTH_DATE")
    private LocalDate birthDate;

    @Column(name = "APPROVED")
    private Boolean approved;

    @OneToMany(fetch = FetchType.LAZY)
    @JoinColumn(name = "buyer_id")
    private List<Product> purchasedProducts;

    @OneToMany(fetch = FetchType.LAZY)
    @JoinColumn(name = "buyer_id")
    private List<AuctionProduct> purchasedAuctionProducts;
}
