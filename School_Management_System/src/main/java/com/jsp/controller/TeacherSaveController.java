package com.jsp.controller;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.jsp.dao.TeacherDao;
import com.jsp.dto.TeacherDto;
import com.jsp.service.TeacherService;

@WebServlet("/saveteacher")
public class TeacherSaveController extends HttpServlet{
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		String name = req.getParameter("name");
		String cno = req.getParameter("cno");
		String subject = req.getParameter("subject");
		
		TeacherDto teacherDto = new TeacherDto();
		teacherDto.setName(name);
		teacherDto.setCno(cno);
		teacherDto.setSubject(subject);
		
		
		TeacherService teacherService = new TeacherService();
		teacherService.saveTeacher(teacherDto);
	}

}
