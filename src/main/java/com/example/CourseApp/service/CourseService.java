package com.example.CourseApp.service;

import java.util.List;

import com.example.CourseApp.entity.Course;

public interface CourseService {
	
	public List<Course> getCourses();

	public Course getCourse(Long courseId);

	public Course addCourse(Course course);

	public Course updateCourse(Course course);

	public void deleteCourse(Long courseId) throws Exception;

}
