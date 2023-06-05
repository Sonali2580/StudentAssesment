package edu.student.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import edu.student.entity.Student;
import edu.student.repository.StudentRepository;

@Service
public class StudentServiceImpl implements StudentService {

	@Autowired
	private StudentRepository studentRepository;

	@Override
	public Student createStudent(Student st) {
		// TODO Auto-generated method stub
		return studentRepository.save(st);
	}

	@Override
	public List<Student> getAllStudents() {
		// TODO Auto-generated method stub
		return studentRepository.findAll();
	}

	@Override
	public Student getAStudent(int id) {
		// Use of Optional
		// Optional<Student> o = studentRepository.findById(id);
		// Student st = o.get();
		// return st;
		return studentRepository.findById(id).get();
	}

	@Override
	public Student updateStudent(Student student, int id) {
		// update an student
		Student _student = studentRepository.findById(id).get();
		_student.setName(student.getName());
		_student.setAddress(student.getAddress());
		return studentRepository.save(_student);
	}

	@Override
	public String deleteStudent(int id) {
		// delete a student
		studentRepository.deleteById(id);

		return "The student with id " + id + "has been deleted....";
	}

}
