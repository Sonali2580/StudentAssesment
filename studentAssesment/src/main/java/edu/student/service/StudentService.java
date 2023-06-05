package edu.student.service;

import java.util.List;

import org.springframework.stereotype.Component;

import edu.student.entity.Student;
@Component
public interface StudentService {

	Student createStudent(Student st);

	List<Student> getAllStudents();

	Student getAStudent(int id);

	Student updateStudent(Student student, int id);

	String deleteStudent(int id);

}
