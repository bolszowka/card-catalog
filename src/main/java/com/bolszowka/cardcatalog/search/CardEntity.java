package com.bolszowka.cardcatalog.search;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "card")
public class CardEntity {

    @Id
    private Long id;
    private String number;
    private String title;
    private String section;
    private String type;

    public SearchResultDto toSearchResultDto() {
        return SearchResultDto.builder()
                .id(this.id)
                .number(this.number)
                .title(this.title)
                .section(this.section)
                .type(this.type)
                .build();
    }
}