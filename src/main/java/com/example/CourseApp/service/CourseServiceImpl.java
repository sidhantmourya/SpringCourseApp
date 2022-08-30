package com.example.CourseApp.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Service;

import com.example.CourseApp.entity.Course;

@Service
public class CourseServiceImpl implements CourseService {

	List<Course> courses;
	
	
	
	public CourseServiceImpl() {
		courses = new ArrayList<>();
		courses.add(new Course(123L, "test1", "DescriptionCourse1") );
		courses.add(new Course(124L, "test2", "DescriptionCourse2") );
		courses.add(new Course(125L, "test3", "DescriptionCourse3") );
		courses.add(new Course(126L, "test4", "DescriptionCourse4") );
		courses.add(new Course(127L, "test5", "DescriptionCourse5") );
	}



	@Override
	public List<Course> getCourses() {
		
		return courses;
	}



	@Override
	public Course getCourse(Long courseId) {
		
		courses.forEach(course -> { return course.getId().equals(courseId) ? course : null; });
	}

}
