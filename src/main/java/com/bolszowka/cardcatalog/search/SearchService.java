package com.bolszowka.cardcatalog.search;

import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class SearchService {

    //TODO temp mock
    public List<SearchResultDto> search() {
        return List.of(
                SearchResultDto.builder()
                        .id("2b0c2a87-734c-4d3f-9dc4-baa7f9e8a87a")
                        .number("1")
                        .title("Robert Lewandowski")
                        .section("FC Bayern München")
                        .build()
        );
    }
}
