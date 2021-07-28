package com.aandras.interview.library.model;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class Book {
    private String isbn;
    private String name;
    private Integer yearPublished;
    private String publisher;
    private String summary;
}
