package ru.ylab.motuzok.app.dto;

import lombok.Data;

@Data
public class UserDto {
    private Long id;
    private String fullName;
    private String title;
    private int age;
}
