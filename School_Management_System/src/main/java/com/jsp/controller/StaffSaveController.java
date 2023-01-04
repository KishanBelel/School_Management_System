package com.jsp.controller;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.jsp.dto.StaffDto;
import com.jsp.service.StaffService;

@WebServlet("/saveStaff")
public class StaffSaveController extends HttpServlet  {
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		String name =req.getParameter("name");
		String email = req.getParameter("email");
		String job = req.getParameter("job");
		
		
		StaffDto staffDto = new StaffDto();
		staffDto.setName(name);
		staffDto.setEmail(email);
		staffDto.setJob(job);
		
		StaffService staffService = new StaffService();
		staffService.saveStaff(staffDto);
		
	}
}
