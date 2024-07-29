package com.rakesh.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RequestBody;

import com.rakesh.model.Student;
import com.rakesh.repository.StudentRepository;

@Service
public class StudentServiceImpl implements StudentService {
	
	@Autowired
	private StudentRepository studentRepo;
	
	@Override
	public Student add(Student s) {
		return studentRepo.save(s);
	}

	@Override
	public void delete(int id) {
		 studentRepo.deleteById(id);
	}

	@Override
	public Student update(Integer id,Student s) {
		s.setId(id);
		return studentRepo.save(s);
	}

	@Override
	public Student getStudent( int id) {
		return studentRepo.findById(id).orElse(null);
	}

	@Override
	public List<Student> getAllStudent() {
		return studentRepo.findAll();
	}
		
}
