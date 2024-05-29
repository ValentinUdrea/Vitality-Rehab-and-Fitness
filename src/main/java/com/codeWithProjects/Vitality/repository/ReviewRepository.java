package com.codeWithProjects.Vitality.repository;

import com.codeWithProjects.Vitality.entity.Review;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ReviewRepository extends JpaRepository<Review, Long> {
}
