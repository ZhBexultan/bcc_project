package com.dnevnik.kz.dnevnik.model;

import lombok.Data;

import javax.persistence.*;

@Data
@Entity
@Table(name = "dn_student")
public class Student {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "name", nullable = false)
    private String name;

    @Column(name = "gender", nullable = false)
    private String gender;

    @Column(name = "account_id")
    private Long accountId;

    @Column(name = "group_id")
    private Long groupId;

}
