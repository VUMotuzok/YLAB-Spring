package ru.ylab.motuzok.app.web.request;

import lombok.Data;

import java.util.List;

@Data
public class UserBookRequest {
    private UserRequest userRequest;
    private List<BookRequest> bookRequests;
}
