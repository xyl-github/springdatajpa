package com.wys.repository;

import com.wys.entity.Course;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CourseRepository extends JpaRepository<Course,Integer> {
}
