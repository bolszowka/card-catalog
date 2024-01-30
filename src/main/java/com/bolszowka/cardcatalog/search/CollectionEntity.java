package com.bolszowka.cardcatalog.search;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "collection")
public class CollectionEntity {

    @Id
    private Long id;

    private String name;
}