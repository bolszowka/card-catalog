package com.bolszowka.cardcatalog.search;

import lombok.Builder;
import lombok.Value;

@Value
@Builder
public class SearchRequest {

    Long collectionId;
    String titleSearchTerm;
    String section;
    String type;
}