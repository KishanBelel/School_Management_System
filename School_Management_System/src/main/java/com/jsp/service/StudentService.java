package com.jsp.service;

import java.util.List;

import com.jsp.dao.StudentDao;
import com.jsp.dto.StudentDto;

public class StudentService {
	StudentDao studentDao = new StudentDao();

	public StudentDto saveStudent(StudentDto student) {
		return studentDao.saveStudent(student);
	}

	public StudentDto deleteStudent(int id) {
		return studentDao.deleteStudent(id);
	}

	public StudentDto updateStudentName(int id, String name) {
		return studentDao.updateStudentName(id, name);
	}

	public StudentDto updateStudentEmail(int id, String email) {
		return studentDao.updateStudentEmail(id, email);
	}

	public StudentDto updateStudentDob(int id, String dob) {
		return studentDao.updateStudentDob(id, dob);
	}

	public StudentDto getStudent(int id) {
		return studentDao.getStudent(id);
	}

	public List<StudentDto> getAllStudents() {
		return studentDao.getAllStudent();
	}

}