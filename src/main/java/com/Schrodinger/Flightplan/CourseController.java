package com.Schrodinger.Flightplan;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class CourseController {
	
	@Autowired
	CourseRepository courseRepository;
	
	@GetMapping("/course")
	public List<Course> index() {
		return courseRepository.findAll();
	}
	
	@GetMapping("/course/{id}")
	public Course GetCourse(@PathVariable String id) {
		return courseRepository.findById(id).orElse(null);
	}
	
	@PostMapping("/course/search")
	public Course PostCourse(@RequestBody Course course) {
		return courseRepository.save(course);
	}
	
	@PutMapping("/course")
	public Course PutCourse(@RequestBody Course course) {
		Course oldCourse = courseRepository.findById(course.getSubject()).orElse(null);
		oldCourse.setCredit(course.getCredit());
		oldCourse.setLevel(course.getLevel());
		oldCourse.setSubject(course.getSubject());
		oldCourse.setTitle(course.getTitle());
		return courseRepository.save(oldCourse);
	}
	
	@DeleteMapping("/course/{id}")
	public Integer DeleteCourse(@PathVariable Integer id)
	{
		courseRepository.deleteById(id);
		return id;
	}
	
}