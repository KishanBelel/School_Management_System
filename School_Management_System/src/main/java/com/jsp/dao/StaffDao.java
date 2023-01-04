package com.jsp.dao;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;
import javax.persistence.Query;

import com.jsp.dto.StaffDto;


public class StaffDao {
	EntityManagerFactory entityManagerFactory=Persistence.createEntityManagerFactory("kishan");
	EntityManager entityManager = entityManagerFactory.createEntityManager();
	EntityTransaction entityTransaction =entityManager.getTransaction();
	
	public StaffDto saveStaff(StaffDto staff) {
		entityTransaction.begin();
		entityManager.persist(staff);
		entityTransaction.commit();
		System.out.println("save Successfully");
		return staff;
	}
	
	public StaffDto getstaff(int id) {
		StaffDto staff = entityManager.find(StaffDto.class, id);
		if(staff != null) {
			return staff;
		} else {
			System.out.println("staff doesn't exist");
		}
		return null;
	}
	public StaffDto deleteStaff(int id) {
		StaffDto staff =entityManager.find(StaffDto.class, id);
			if(staff != null) {
				entityTransaction.begin();
				entityManager.remove(staff);
				entityTransaction.commit();
				System.out.println("staff Deleted Successfully");
			}
			else {
				System.out.println("staff doesn't Exist");
			}
			return staff;
		}
	
	public StaffDto  updateStaffName(int id ,String name) {
		StaffDto staff =entityManager.find(StaffDto.class, id);
		if (staff !=null) {
			staff.setName(name);
			entityTransaction.begin();
			entityManager.merge(staff);
			entityTransaction.commit();
			System.out.println("Name updated Successfully");
		}else {
			System.out.println("staff doesn't exist");
		}
		return staff;
	}
	public StaffDto  updateStaffEmail(int id ,String email) {
		StaffDto staff =entityManager.find(StaffDto.class, id);
		if (staff !=null) {
			staff.setEmail(email);
			entityTransaction.begin();
			entityManager.merge(staff);
			entityTransaction.commit();
			System.out.println("Email updated Successfully");
		}else {
			System.out.println("staff doesn't exist");
		}
		return staff;
	}
	public StaffDto  updateStaffJob(int id ,String job) {
		StaffDto staff =entityManager.find(StaffDto.class, id);
		if (staff !=null) {
			staff.setJob(job);
			entityTransaction.begin();
			entityManager.merge(staff);
			entityTransaction.commit();
			System.out.println("Job updated Successfully");
		}else {
			System.out.println("staff doesn't exist");
		}
		return staff;
	}
	
	public List<StaffDto> getAllStaffs(){
		String sql ="Select s from StaffDto s";
		Query query = entityManager.createQuery(sql);
		return query.getResultList();
	}
	
	
	
		
	}
			


