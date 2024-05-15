package com.codeWithProjects.Vitality.dto;

import com.codeWithProjects.Vitality.enums.UserRole;
import lombok.Data;

@Data
public class UserDto {
    private Long id;
    private String email;
    private String name;
    private UserRole userRole;

}
