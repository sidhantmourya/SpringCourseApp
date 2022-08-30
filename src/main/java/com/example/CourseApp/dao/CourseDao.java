package com.example.CourseApp.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.CourseApp.entity.Course;

@Repository
public interface CourseDao extends JpaRepository<Course, Long>{

}
