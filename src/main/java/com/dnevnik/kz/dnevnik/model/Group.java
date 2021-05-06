package com.dnevnik.kz.dnevnik.model;

import lombok.Data;

import javax.persistence.*;

@Data
@Entity
@Table(name = "dn_group")
public class Group {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "name")
    private String name;

}
