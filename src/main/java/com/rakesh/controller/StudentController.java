package com.rakesh.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.rakesh.model.Student;
import com.rakesh.services.StudentService;

@RestController
public class StudentController {
	
	@Autowired
	private StudentService studentService;

	@PostMapping("/save")
	public Student createStudent(@RequestBody Student s) {			//done
		return studentService.add(s);
	}
	
	@PutMapping("/update/{id}")
	public Student updateStudent(@PathVariable Integer id, @RequestBody Student s) {
		return studentService.update(id, s);					//done
	}
	
	@GetMapping("/get/{id}")
	public Student getStudent(@PathVariable Integer id) {
		return studentService.getStudent(id);					//done
	}
	
	@DeleteMapping(("/delete/{id}"))
	public void deleteStudent(@PathVariable Integer id) {		//done
		studentService.delete(id);
	}
	
	@GetMapping("/getAll")
	public List<Student> getAllStudent() {
		return studentService.getAllStudent();                  //done
	}
}
