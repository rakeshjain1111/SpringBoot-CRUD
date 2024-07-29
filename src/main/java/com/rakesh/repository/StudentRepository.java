package com.rakesh.repository;



import org.springframework.data.jpa.repository.JpaRepository;

import com.rakesh.model.Student;

public interface StudentRepository extends JpaRepository<Student, Integer>{

}
