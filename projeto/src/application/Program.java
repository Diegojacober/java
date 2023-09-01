package application;

import java.util.Date;
import java.util.List;

import model.dao.DaoFactory;
import model.dao.SellerDao;
import model.entities.Department;
import model.entities.Seller;

public class Program {
    public static void main(String[] args) {
        SellerDao sellerDao = new DaoFactory().createSellerDao();

        System.out.println("==== TEST 1: seller findById ====");
        Seller seller = sellerDao.findById(3);
        System.out.println(seller);


        System.out.println("==== TEST 2: seller findByDepartment ====");
        Department dep =  new Department(1, null);
        List<Seller> sellers = (List<Seller>) sellerDao.findByDepartment(dep);

        for (Seller obj : sellers) {
            System.out.println(obj);
        }


        System.out.println(seller);
    }

}
