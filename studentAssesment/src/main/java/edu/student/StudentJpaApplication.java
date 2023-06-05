package edu.student;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import edu.student.entity.Student;

import edu.student.repository.StudentRepository;


@SpringBootApplication
public class StudentJpaApplication implements CommandLineRunner {
	@Autowired
	private StudentRepository studentRepository;
	

	public static void main(String[] args) {
		SpringApplication.run(StudentJpaApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		// Student Details
		
		
		
		Student s = Student.builder().name("swastika").address("delhi").build();
		Student s1 = Student.builder().name("sonali").address("chennai").build();
		Student s2 = Student.builder().name("mitul").address("kolkata").build();
		Student s3 = Student.builder().name("nisha").address("bangalore").build();

		studentRepository.save(s);
		studentRepository.save(s1);
		studentRepository.save(s2);
		studentRepository.save(s3);
		
		System.out.println("----------------all saved--------------");

	}

}
