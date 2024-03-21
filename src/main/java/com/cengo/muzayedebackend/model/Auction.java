package com.cengo.muzayedebackend.model;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.time.Instant;
import java.util.List;

@Entity
@Table(name = "auction")
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
public class Auction {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "name")
    private String name;

    @Column(name = "description")
    private String description;

    @Column(name = "start_date")
    @Temporal(TemporalType.TIMESTAMP)
    private Instant startDate;

    @Column(name = "end_date")
    @Temporal(TemporalType.TIMESTAMP)
    private Instant endDate;

    @Column(name = "state")
    @Enumerated(EnumType.STRING)
    private AuctionState state;

    @OneToMany(fetch = FetchType.EAGER)
    @JoinColumn(name = "auction_id")
    private List<AuctionProduct> products;

}
