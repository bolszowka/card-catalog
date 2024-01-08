package com.bolszowka.cardcatalog.search;

import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequiredArgsConstructor
public class SearchController {

    private final SearchService searchService;

    //TODO add search params
    @GetMapping("/search")
    public List<SearchResultDto> search() {
        return searchService.search();
    }
}
