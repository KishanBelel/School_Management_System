package com.jsp.controller;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.jsp.dao.StudentDao;
import com.jsp.dto.StudentDto;
import com.jsp.service.StudentService;

@WebServlet("/saveStudent")
public class StudentSaveController extends HttpServlet {
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		String name = req.getParameter("name");
		String email = req.getParameter("email");
		String dob = req.getParameter("dob");

		StudentDto studentDto = new StudentDto();
		studentDto.setName(name);
		studentDto.setEmail(email);
		studentDto.setDob(dob);

		StudentService student = new StudentService();
		student.saveStudent(studentDto);
	}
}