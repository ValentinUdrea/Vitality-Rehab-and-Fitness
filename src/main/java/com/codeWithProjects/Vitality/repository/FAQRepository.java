package com.codeWithProjects.Vitality.repository;

import com.codeWithProjects.Vitality.entity.FAQ;
import lombok.Data;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface FAQRepository extends JpaRepository<FAQ, Long> {

    List<FAQ> findAllByProductId(Long productId);
}
