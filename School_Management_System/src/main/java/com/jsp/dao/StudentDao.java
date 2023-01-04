package com.jsp.dao;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;
import javax.persistence.Query;

import com.jsp.dto.StudentDto;

public class StudentDao {
	EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("kishan");
	EntityManager entityManager = entityManagerFactory.createEntityManager();
	EntityTransaction entityTransaction = entityManager.getTransaction();

	public StudentDto saveStudent(StudentDto student) {
		entityTransaction.begin();
		entityManager.persist(student);
		entityTransaction.commit();
		System.out.println("Save successfully");
		return student;
	}

	public StudentDto deleteStudent(int id) {
		StudentDto student = entityManager.find(StudentDto.class, id);
		if (student != null) {
			entityTransaction.begin();
			entityManager.remove(student);
			entityTransaction.commit();
			System.out.println("Delete successfully");
		} else {
			System.out.println("Student not exist");
		}
		return student;
	}

	public StudentDto updateStudentName(int id, String name) {
		StudentDto student = entityManager.find(StudentDto.class, id);
		if (student != null) {
			student.setName(name);
			entityTransaction.begin();
			entityManager.merge(student);
			entityTransaction.commit();
			System.out.println("Name updated successfully");
		} else {
			System.out.println("Student not exist");
		}
		return student;
	}

	public StudentDto updateStudentEmail(int id, String email) {
		StudentDto student = entityManager.find(StudentDto.class, id);
		if (student != null) {
			student.setEmail(email);
			entityTransaction.begin();
			entityManager.merge(student);
			entityTransaction.commit();
			System.out.println("Email updated successfully");
		} else {
			System.out.println("Student not exist");
		}
		return student;
	}

	public StudentDto updateStudentDob(int id, String dob) {
		StudentDto student = entityManager.find(StudentDto.class, id);
		if (student != null) {
			student.setDob(dob);
			entityTransaction.begin();
			entityManager.merge(student);
			entityTransaction.commit();
			System.out.println("DOB updated successfully");
		} else {
			System.out.println("Student not exist");
		}
		return student;
	}

	public StudentDto getStudent(int id) {
		StudentDto student = entityManager.find(StudentDto.class, id);
		if (student != null) {
			return student;
		} else {
			System.out.println("Student not exist");
		}
		return null;
	}

	public List<StudentDto> getAllStudent() {
		String sql = "Select s from StudentDto s";
		Query query = entityManager.createQuery(sql);
		return query.getResultList();
	}
}