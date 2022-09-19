package ru.ylab.motuzok.app.service;


import ru.ylab.motuzok.app.dto.BookDto;

public interface BookService {
    BookDto createBook(BookDto userDto);

    BookDto updateBook(BookDto userDto);

    BookDto getBookById(Long id);

    void deleteBookById(Long id);
}
