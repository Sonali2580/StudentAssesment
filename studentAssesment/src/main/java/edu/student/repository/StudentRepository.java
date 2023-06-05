package edu.student.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import edu.student.entity.Student;

public interface StudentRepository extends JpaRepository<Student, Integer> {

}
