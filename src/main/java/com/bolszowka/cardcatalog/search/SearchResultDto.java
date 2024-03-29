package com.bolszowka.cardcatalog.search;

import lombok.Builder;
import lombok.Value;

@Value
@Builder
public class SearchResultDto {

    Long id;
    String number;
    String title;
    String section;
    String type;
}
