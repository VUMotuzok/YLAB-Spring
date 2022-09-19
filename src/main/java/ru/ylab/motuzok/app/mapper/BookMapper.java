package ru.ylab.motuzok.app.mapper;

import ru.ylab.motuzok.app.dto.BookDto;
import ru.ylab.motuzok.app.web.request.BookRequest;
import org.mapstruct.Mapper;

@Mapper(componentModel = "spring")
public interface BookMapper {

    BookDto bookRequestToBookDto(BookRequest bookRequest);

    BookRequest bookDtoToBookRequest(BookDto bookDto);
}
