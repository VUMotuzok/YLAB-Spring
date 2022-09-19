package ru.ylab.motuzok.app.mapper;

import ru.ylab.motuzok.app.dto.UserDto;
import ru.ylab.motuzok.app.web.request.UserRequest;
import org.mapstruct.Mapper;

@Mapper(componentModel = "spring")
public interface UserMapper {
    UserDto userRequestToUserDto(UserRequest userRequest);

    UserRequest userDtoToUserRequest(UserDto userDto);
}
