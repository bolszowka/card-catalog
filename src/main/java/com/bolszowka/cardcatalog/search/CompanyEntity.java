package com.bolszowka.cardcatalog.search;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "company")
public class CompanyEntity {

    @Id
    private Long id;

    private String name;
}