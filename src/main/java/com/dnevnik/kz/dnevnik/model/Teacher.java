package com.dnevnik.kz.dnevnik.model;

import lombok.Data;

import javax.persistence.*;

@Data
@Entity
@Table(name = "dn_teacher")
public class Teacher {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "name", nullable = false)
    private String name;

    @Column(name = "account_id")
    private Long accountId;

}
