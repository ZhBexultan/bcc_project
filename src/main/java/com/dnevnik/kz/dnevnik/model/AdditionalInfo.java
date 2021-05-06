package com.dnevnik.kz.dnevnik.model;

import lombok.Data;

import javax.persistence.*;

@Data
@Entity
@Table(name = "dn_additional_info")
public class AdditionalInfo {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "homework", length = 512)
    private String homework;

    @Column(name = "additional_info", length = 512)
    private String additionalInfo;

}
