package application;

import java.util.Date;
import java.util.List;
import java.util.Scanner;

import model.dao.DaoFactory;
import model.dao.DepartmentDao;
import model.dao.SellerDao;
import model.dao.impl.DepartmentDaoJDBC;
import model.entities.Department;
import model.entities.Seller;

public class Program {
    public static void main(String[] args) {

        /*
         * SellerDao sellerDao = new DaoFactory().createSellerDao();
         * 
         * System.out.
         * println("==================== TEST 1: seller findById ====================");
         * Seller seller = sellerDao.findById(3);
         * System.out.println(seller);
         * 
         * 
         * System.out.
         * println("==================== TEST 2: seller findByDepartment ===================="
         * );
         * Department dep = new Department(1, null);
         * List<Seller> sellers = sellerDao.findByDepartment(dep);
         * 
         * for (Seller obj : sellers) {
         * System.out.println(obj);
         * }
         * 
         * 
         * System.out.
         * println("==================== TEST 3: seller findAll ====================");
         * List<Seller> allSellers = sellerDao.findAll();
         * 
         * for (Seller obj : allSellers) {
         * System.out.println(obj);
         * }
         * 
         * 
         * System.out.
         * println("==================== TEST 4: seller insert ====================");
         * Seller newSeller = new Seller(null, "Greg", "greg@gmail.com", new Date(),
         * 4000.0, dep);
         * sellerDao.insert(newSeller);
         * System.out.println("Inserted! New id = " + newSeller.getId());
         * 
         * 
         * System.out.
         * println("==================== TEST 5: seller update ====================");
         * newSeller = sellerDao.findById(1);
         * 
         * newSeller.setName("Martha Waine");
         * sellerDao.update(newSeller);
         * System.out.println("Update completed");
         * 
         * 
         * System.out.
         * println("==================== TEST 6: seller delete ====================");
         * Scanner sc = new Scanner(System.in);
         * 
         * System.out.println("Enter id for delete test: ");
         * int id = sc.nextInt();
         * sellerDao.deleteById(id);
         * System.out.println("Deleted completed");
         * 
         * sc.close();
         */

        DepartmentDao departmentDao = new DaoFactory().createDepartmentDao();

        System.out.println("==================== TEST 1: department findById ====================");
        Department department = departmentDao.findById(1);
        System.out.println(department);

        System.out.println("==================== TEST 2: department findAll ====================");
        List<Department> allDepartments = departmentDao.findAll();

        for (Department obj : allDepartments) {
            System.out.println(obj);
        }

        System.out.println("==================== TEST 3: department insert ====================");
        Department newDepartment = new Department(null, "Dep test");
        departmentDao.insert(newDepartment);
        System.out.println("Inserted! New id = " + newDepartment.getId());

        System.out.println("==================== TEST 4: department update ====================");
        newDepartment = departmentDao.findById(3);
        newDepartment.setName("HR");
        departmentDao.update(newDepartment);
        System.out.println("Update completed");

        System.out.println("==================== TEST 5: department delete ====================");
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter id for delete test: ");
        int id = sc.nextInt();
        departmentDao.deleteById(id);
        System.out.println("Deleted completed");

        sc.close();
    }

}
