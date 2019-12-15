package com.example.iot.iot.domain;

import lombok.Data;

import javax.persistence.*;

@Entity
@Data
@Table(name = "pumps")
public class Pump {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    Long id;

    @Column(name = "active")
    Boolean active;


}
