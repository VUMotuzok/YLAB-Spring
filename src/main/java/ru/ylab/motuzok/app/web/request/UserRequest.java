package ru.ylab.motuzok.app.web.request;

import lombok.Data;

@Data
public class UserRequest {
    private String fullName;
    private String title;
    private int age;
}
