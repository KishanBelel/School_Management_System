package com.jsp.controller;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.jsp.dto.StudentDto;
import com.jsp.service.StudentService;

@WebServlet("/getStudent")
public class StudentGetController extends HttpServlet {
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		int id = Integer.parseInt(req.getParameter("id"));

		StudentService studentService = new StudentService();
		StudentDto student = studentService.getStudent(id);

		PrintWriter printWriter = resp.getWriter();
		printWriter.print("<html><body><h1>" +"Id : "+ student.getId()+"</html></body></h1>");
		printWriter.print("<html><body><h1>" +"Name : "+ student.getName()+"</html></body></h1>");
		printWriter.print("<html><body><h1>" +"Email : "+ student.getEmail()+"</html></body></h1>");
		printWriter.print("<html><body><h1>" +"Job : "+ student.getDob()+"</html></body></h1>");

	}
}