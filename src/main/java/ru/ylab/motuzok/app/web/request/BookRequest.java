package ru.ylab.motuzok.app.web.request;

import lombok.Data;

@Data
public class BookRequest {
    private String title;
    private String author;
    private long pageCount;
}
