package com.bolszowka.cardcatalog.search;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
@RequiredArgsConstructor
public class SearchService {

    private final CardRepository cardRepository;

    public List<SearchResultDto> search(SearchRequest request) {
        //TODO temporary skipped request
        return cardRepository.findAll().stream()
                .map(CardEntity::toSearchResultDto)
                .collect(Collectors.toList());
    }
}
