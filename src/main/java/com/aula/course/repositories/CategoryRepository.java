package com.aula.course.repositories;

import com.aula.course.entities.Category;
import com.aula.course.entities.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CategoryRepository extends JpaRepository<Category, Long> {



}
