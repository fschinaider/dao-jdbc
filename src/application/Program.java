package application;

import java.util.Date;

import model.dao.DaoFactory;
import model.dao.SellerDao;
import model.entities.Departament;
import model.entities.Seller;

public class Program {

	public static void main(String[] args) {
		Departament obj = new Departament(1, "books");
		Seller seller = new Seller(21, "ann", "ann@gmail", new Date(), 3000.0, obj);
		SellerDao sellerDao = DaoFactory.createSellerDao();
 		System.out.println(seller);
	}
}
