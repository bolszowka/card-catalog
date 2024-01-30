package com.bolszowka.cardcatalog.search;

import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequiredArgsConstructor
public class SearchController {

    private final SearchService searchService;

    @PostMapping("/search")
    public List<SearchResultDto> search(@RequestBody SearchRequest request) {
        return searchService.search(request);
    }
}
