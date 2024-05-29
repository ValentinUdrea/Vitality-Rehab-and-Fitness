package com.codeWithProjects.Vitality.dto;

import com.codeWithProjects.Vitality.entity.Product;
import com.codeWithProjects.Vitality.entity.User;
import jakarta.persistence.*;
import lombok.Data;
import org.hibernate.annotations.OnDelete;
import org.hibernate.annotations.OnDeleteAction;
import org.springframework.web.multipart.MultipartFile;

import java.awt.font.MultipleMaster;

@Data
public class ReviewDto {


    private Long id;

    private Long rating;


    private String description;

    private MultipartFile img;


    private byte[] returnedimg;


    private Long userId;



    private Long productId;

    private String username;
}
