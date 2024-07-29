package com.rakesh.services;

import java.util.List;

import org.springframework.stereotype.Service;

import com.rakesh.model.Student;

@Service
public interface StudentService {
   
	public Student add(Student s);
	public void delete(int id);
	public Student update(Integer id, Student s);
	public Student getStudent(int id);
	public List<Student> getAllStudent();

	
}
