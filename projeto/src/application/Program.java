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

        System.out.println("==================== TEST 1: seller findById ====================");
        Seller seller = sellerDao.findById(3);
        System.out.println(seller);


        System.out.println("==================== TEST 2: seller findByDepartment ====================");
        Department dep =  new Department(1, null);
        List<Seller> sellers = sellerDao.findByDepartment(dep);

        for (Seller obj : sellers) {
            System.out.println(obj);
        }


        System.out.println("==================== TEST 3: seller findAll ====================");
        List<Seller> allSellers =  sellerDao.findAll();

        for (Seller obj : allSellers) {
            System.out.println(obj);
        }


        System.out.println("==================== TEST 4: seller insert ====================");
        Seller newSeller = new Seller(null, "Greg", "greg@gmail.com", new Date(), 4000.0, dep);
        sellerDao.insert(newSeller);
        System.out.println("Inserted! New id = " + newSeller.getId());


        System.out.println("==================== TEST 5: seller update ====================");
        newSeller = sellerDao.findById(1);

        newSeller.setName("Martha Waine");
        sellerDao.update(newSeller);
        System.out.println("Update completed");
    }

}
