package com.codeWithProjects.Vitality.entity;

import com.codeWithProjects.Vitality.enums.UserRole;
import jakarta.persistence.*;
import lombok.Data;
import org.springframework.web.servlet.handler.UserRoleAuthorizationInterceptor;

@Entity
@Data
@Table(name = "users")
public class User {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)//increments the id while creating a new user
    private Long id;

    private String email;

    private String password;

    private String name;

    private UserRole role;

    @Lob
    @Column(columnDefinition = "longblob")
    private byte[] img;//Storing the user image
}
