package application;

import java.util.Scanner;

import model.dao.DaoFactory;
import model.dao.DepartmentDao;
import model.dao.SellerDao;
import model.entities.Department;

public class Program2 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in); 
		DepartmentDao departmentDao = DaoFactory.createDepartmentDao();
		
		System.out.println("==== TESTE 1: Department findById ====");
		Department department = departmentDao.findById(2);
		System.out.println(department);
		
		/*
		System.out.println("\n==== TESTE 2: Department findAll ====");
		
		
		System.out.println("\n==== TESTE 3: Department insert ====");
		
		
		System.out.println("\n==== TESTE 4: Department Update ====");
		
		
		System.out.println("\n==== TESTE 5: Department delete ====");
		*/
		sc.close();
	}

}
