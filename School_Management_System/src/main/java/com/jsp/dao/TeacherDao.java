package com.jsp.dao;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;
import javax.persistence.Query;

import com.jsp.dto.StudentDto;
import com.jsp.dto.TeacherDto;

public class TeacherDao {
	EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("kishan");
	EntityManager entityManager = entityManagerFactory.createEntityManager();
	EntityTransaction entityTransaction = entityManager.getTransaction();

	public TeacherDto saveTeacher(TeacherDto teacher) {
		entityTransaction.begin();
		entityManager.persist(teacher);
		entityTransaction.commit();
		System.out.println("Save successfully");
		return teacher;
	}

	public TeacherDto deleteTeacher(int id) {
		TeacherDto teacher = entityManager.find(TeacherDto.class, id);
		if (teacher != null) {
			entityTransaction.begin();
			entityManager.remove(teacher);
			entityTransaction.commit();
			System.out.println("Delete successfully");
		} else {
			System.out.println("teacher not exist");
		}
		return teacher;
	}

	public TeacherDto updateTeacherName(int id, String name) {
		TeacherDto teacher = entityManager.find(TeacherDto.class, id);
		if (teacher != null) {
			teacher.setName(name);
			entityTransaction.begin();
			entityManager.merge(teacher);
			entityTransaction.commit();
			System.out.println("Name updated successfully");
		} else {
			System.out.println("Teacher not exist");
		}
		return teacher;
	}

	public TeacherDto updateTeacherSubject(int id, String subject) {
		TeacherDto teacher = entityManager.find(TeacherDto.class, id);
		if (teacher != null) {
			teacher.setSubject(subject);
			entityTransaction.begin();
			entityManager.merge(teacher);
			entityTransaction.commit();
			System.out.println("Subject updated successfully");
		} else {
			System.out.println("Teacher not exist");
		}
		return teacher;
	}

	public TeacherDto updateTeacherCno(int id, String cno) {
		TeacherDto teacher = entityManager.find(TeacherDto.class, id);
		if (teacher != null) {
			teacher.setCno(cno);
			entityTransaction.begin();
			entityManager.merge(teacher);
			entityTransaction.commit();
			System.out.println("Contact updated successfully");
		} else {
			System.out.println("Teacher not exist");
		}
		return teacher;
	}

	public TeacherDto getTeacher(int id) {
		TeacherDto teacher = entityManager.find(TeacherDto.class, id);
		if (teacher != null) {
			return teacher;
		} else {
			System.out.println("teacher not exist");
		}
		return null;
	}

	public List<TeacherDto> getAllTeachers() {
		String sql = "Select s from TeacherDto s";
		Query query = entityManager.createQuery(sql);
		return query.getResultList();
	}
}