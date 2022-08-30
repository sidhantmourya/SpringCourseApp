package com.example.CourseApp.service;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.CourseApp.dao.CourseDao;
import com.example.CourseApp.entity.Course;

@Service
public class CourseServiceImpl implements CourseService {

//	List<Course> courses;
	@Autowired
	private CourseDao courseDao;
	
	
	public CourseServiceImpl() {
//		courses = new ArrayList<>();
//		courses.add(new Course(123L, "test1", "DescriptionCourse1") );
//		courses.add(new Course(124L, "test2", "DescriptionCourse2") );
//		courses.add(new Course(125L, "test3", "DescriptionCourse3") );
//		courses.add(new Course(126L, "test4", "DescriptionCourse4") );
//		courses.add(new Course(127L, "test5", "DescriptionCourse5") );
	}



	@Override
	public List<Course> getCourses() {
		
		return courseDao.findAll();
	}



	@Override
	public Course getCourse(Long courseId) {
		
//		for(Course course : courseDao.findAll())
//		{
//			if(course.getId() == courseId)
//			{
//				return course;
//			}
//		}
		return courseDao.getReferenceById(courseId);
		
//		return this.courses.stream()
//				.filter(course -> course.getId() == courseId)
//				.findFirst()
//				.get();
				
	}



	@Override
	public Course addCourse(Course course) {
		courseDao.save(course);
		
//		this.courses.add(course);
		return course;
	}



	@Override
	public Course updateCourse(Course course) {
//		Course tmpCourse = null;
//		for(int i=0;i<this.courses.size();i++)
//		{
//			tmpCourse = this.courses.get(i);
//			if(tmpCourse.getId().equals(course.getId()))
//			{
//				tmpCourse.setDescription(course.getDescription());
//				tmpCourse.setTitle(course.getTitle());
//				this.courses.set(i, tmpCourse);
//				break;
//			}
//		}
//		this.courses.forEach(tmpCourse -> {
//			if(tmpCourse.getId().equals(course.getId())
//					) {
//				tmpCourse.setDescription(course.getDescription());
//				tmpCourse.setTitle(course.getTitle());
//			}
//		}
//				);
//		c= this.courses.stream()
//				 .filter(tmpCourse -> tmpCourse.getId() == course.getId())
//				 .findFirst()
//				 .get();
//		
//		c.setDescription(course.getDescription());
//		c.setTitle(course.getTitle());
		
		
		return this.addCourse(course);
		
		
	}



	@Override
	public void deleteCourse(Long courseId) throws Exception {
//		Course tmpCourse = null;
//		for(int i=0;i<this.courses.size();i++)
//		{
//			tmpCourse = this.courses.get(i);
//			if(tmpCourse.getId().equals(courseId))
//			{
//				this.courses.remove(i);
//				break;
//			}
//		}
//		return tmpCourse;
		
//		courses= this.courses.stream()
//				.filter(course -> course.getId() != courseId)
//				.collect(Collectors.toList());
		
		Course course = this.courseDao.getReferenceById(courseId);
		if(course != null)
			this.courseDao.delete(course);
		else
			throw new Exception("No Entry Present");

	}

}
