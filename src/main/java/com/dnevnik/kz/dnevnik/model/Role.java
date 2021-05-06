package com.dnevnik.kz.dnevnik.model;

import lombok.Data;

import javax.persistence.*;

@Data
@Entity
@Table(name = "dn_role", schema = "public")
public class Role {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "name", nullable = false)
    private String name;



}
