package com.poscodx.entity;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;

@Entity
@Table(name = "pos_ovs_exchange_rate")
@Getter
@Setter
public class ExchangeRateEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY) // Add this line to generate the ID automatically
    private Long id; // Add a primary key field

    private String fromCurr;
    private String toCurr;
    private String rateDate;
    private Float exchangeRate;
    private String rateType;
}
