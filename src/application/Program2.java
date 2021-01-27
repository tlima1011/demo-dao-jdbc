package application;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Scanner;

import model.dao.DaoFactory;
import model.dao.DepartmentDao;
import model.entities.Department;
import model.entities.Seller;

public class Program2 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in); 
		DepartmentDao departmentDao = DaoFactory.createDepartmentDao();
		
		System.out.println("==== TESTE 1: Department findById ====");
		Department department = departmentDao.findById(2);
		System.out.println(department);
				
		System.out.println("\n==== TESTE 2: Department findAll ====");
		List<Department> list = new ArrayList<Department>();
		list = departmentDao.findAll();
		for (Department obj : list) {
			System.out.println(obj);
		}
		System.out.println("\n==== TESTE 3: Department insert ====");
		Department newDepartment = new Department(null, "Sales");
		departmentDao.insert(newDepartment);
		System.out.println("Inserted!! New id = " +newDepartment.getId());		
		
		System.out.println("\n==== TESTE 4: Department Update ====");
		department = departmentDao.findById(6);
		department.setName("Supply Chain");
		departmentDao.update(department);
		System.out.println("Update completed");
		
		/*
		System.out.println("\n==== TESTE 5: Department delete ====");
		*/
		sc.close();
	}

}
