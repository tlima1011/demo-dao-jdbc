package application;

import java.util.Date;
import java.util.List;

import model.dao.DaoFactory;
import model.dao.SellerDao;
import model.entities.Department;
import model.entities.Seller;

public class Program {

	public static void main(String[] args) {
		
		SellerDao sellerDao = DaoFactory.createSellerDao();
		System.out.println("==== TESTE 1: SELLER findById ====");
		Seller seller = sellerDao.findById(3);
		System.out.println(seller);
		System.out.println("\n==== TESTE 2: SELLER findByDepartment ====");
		Department department = new Department(2,null); 
		List<Seller> list = sellerDao.findByDepartment(department);
		for (Seller obj : list) {
			System.out.println(obj);
		}
		System.out.println("\n==== TESTE 3: SELLER findAll ====");
		list = sellerDao.findAll();
		for (Seller obj : list) {
			System.out.println(obj);
		}
		System.out.println("\n==== TESTE 4: SELLER insert ====");
		Seller newSeller = new Seller(null, "Greg","greg@gekmail.com", new Date(), 4000.0, department);
		sellerDao.insert(newSeller);
		System.out.println("Inserted!! New id = " +newSeller.getId());
		
		System.out.println("\n==== TESTE 5: SELLER Update ====");
		seller = sellerDao.findById(1);
		seller.setName("Martha Wayne");
		sellerDao.update(seller);
		System.out.println("Update completed");
	}
}
