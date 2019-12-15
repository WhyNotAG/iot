package com.example.iot.iot.domain;

import lombok.Data;

import javax.persistence.*;

@Entity
@Data
@Table(name = "statistic")
public class Statistic {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    Long id;

    @Column(name = "date")
    String date;

    @Column(name = "humidity")
    String humidity;

    @Column(name = "watering")
    Boolean watering;
}
