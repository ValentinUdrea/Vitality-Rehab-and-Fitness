package com.codeWithProjects.Vitality.repository;

import com.codeWithProjects.Vitality.entity.FAQ;
import lombok.Data;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface FAQRepository extends JpaRepository<FAQ, Long> {

}
