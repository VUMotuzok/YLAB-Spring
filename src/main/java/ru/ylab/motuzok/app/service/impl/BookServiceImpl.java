package ru.ylab.motuzok.app.service.impl;

import ru.ylab.motuzok.app.dto.BookDto;
import ru.ylab.motuzok.app.service.BookService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

@Slf4j
@Service
public class BookServiceImpl implements BookService {
    @Override
    public BookDto createBook(BookDto bookDto) {
        bookDto.setId(22L);
        return bookDto;
    }

    @Override
    public BookDto updateBook(BookDto bookDto) {
        return null;
    }

    @Override
    public BookDto getBookById(Long id) {
        return null;
    }

    @Override
    public void deleteBookById(Long id) {

    }
}
