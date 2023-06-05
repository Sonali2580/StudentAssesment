package edu.student.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import edu.student.entity.Student;
import edu.student.service.StudentService;

@RestController
public class StudentController {
	@Autowired
	private StudentService studentService;

	// create a new student
	@PostMapping(value = "/student")
	public Student create(@RequestBody Student student) {
		return studentService.createStudent(student);

	}

	// get all existing students
	@GetMapping(value = "/student")
	public List<Student> getAll() {
		return studentService.getAllStudents();

	}
	// Get a student

	@GetMapping(value = "/student/{id}")
	public Student getAStudent(@PathVariable int id) {
		return studentService.getAStudent(id);
	}

	// Update a student

	@PutMapping(value = "/student/{id}")
	public Student updateAStudent(@PathVariable int id, @RequestBody Student student) {
		return studentService.updateStudent(student, id);
	}

	@DeleteMapping(value = "/student/{id}")
	public String deleteAStudent(@PathVariable int id) {
		return studentService.deleteStudent(id);
	}

}
