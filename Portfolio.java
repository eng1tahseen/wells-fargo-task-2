package com.yourpackage.entities;

import javax.persistence.*;

@Entity
public class Portfolio {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @OneToOne(optional = false)
    @JoinColumn(name = "client_id", nullable = false, unique = true)
    private Client client;

    @Column
    private String portfolioName;

    @Column
    private java.time.LocalDate createdDate;

    public Portfolio(Long id, Client client, String portfolioName, java.time.LocalDate createdDate) {
        this.id = id;
        this.client = client;
        this.portfolioName = portfolioName;
        this.createdDate = createdDate;
    }

    public Portfolio() {
    }

    public Long getId() { return id; }
    public Client getClient() { return client; }
    public void setClient(Client client) { this.client = client; }
    public String getPortfolioName() { return portfolioName; }
    public void setPortfolioName(String portfolioName) { this.portfolioName = portfolioName; }
    public java.time.LocalDate getCreatedDate() { return createdDate; }
    public void setCreatedDate(java.time.LocalDate createdDate) { this.createdDate = createdDate; }
}