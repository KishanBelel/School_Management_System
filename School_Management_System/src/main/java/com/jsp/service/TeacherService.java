package com.jsp.service;

import java.util.List;

import com.jsp.dao.TeacherDao;
import com.jsp.dto.TeacherDto;

public class TeacherService {
	
	TeacherDao teacherDao = new TeacherDao();

	
	public TeacherDto saveTeacher(TeacherDto teacher) {
		return teacherDao.saveTeacher(teacher);
}
	public TeacherDto deleteTeacher(int id) {
		return teacherDao.deleteTeacher(id);
	}
	public TeacherDto updateTeacherName(int id, String name) {
		return teacherDao.updateTeacherName(id, name);
	}
	public TeacherDto updatTeacherCno(int id , String Cno) {
		return teacherDao.updateTeacherCno(id, Cno);
	}
	public TeacherDto updateTeacherSubject(int id , String subject) {
		return teacherDao.updateTeacherSubject(id, subject);
	}
	public TeacherDto getTeacher(int id) {
		return teacherDao.getTeacher(id);
	}
	 public List<TeacherDto> getAllTeacher(){
		 return teacherDao.getAllTeachers();
	 }
}