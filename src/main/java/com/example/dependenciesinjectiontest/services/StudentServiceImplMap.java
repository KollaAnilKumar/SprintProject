package com.example.dependenciesinjectiontest.services;

import java.util.ArrayList;
import java.util.HashMap;
 
import java.util.Map;
import java.util.List;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Service;

import com.example.dependenciesinjectiontest.model.Student;
@Service
 
 
public class StudentServiceImplMap implements StudentService {

 

	    private Map<String, Student> student;

	    public StudentServiceImplMap() {
	        student = new HashMap<>();
	        student.put("1", null);
	         
	    }

	    @Override
	    public void add(Student student) {
	        student.put(student.getIdStudent(), student);
	    }

	    @Override
	    public void delete(Student student) {
	       student.remove(student.getIdStudent());
	    }

	    @Override
	    public List<Student> all() {
	        return new ArrayList<>(student.values());
	    }

	    @Override
	    public Student findById(String id) {
	        return student.get(id);
	    }

		@Override
		public void remove(Student student) {
			// TODO Auto-generated method stub
			
		}

		 
	}

 
