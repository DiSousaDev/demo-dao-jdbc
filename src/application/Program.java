package application;

import model.dao.DaoFactory;
import model.dao.SellerDao;
import model.entities.Department;
import model.entities.Seller;

import java.util.List;

public class Program {
    public static void main(String[] args){

        SellerDao sellerDao = DaoFactory.createSellerDao();

        System.out.println("====TESTE 1: Seller find by id; ==== ");
        Seller seller = sellerDao.findById(3);
        System.out.println(seller);

        System.out.println("====TESTE 2: Seller find by department; ==== ");
        List<Seller> sellers = sellerDao.findByDepartment(new Department(2,null));

        for (Seller s : sellers) {
            System.out.println(s);
        }

        System.out.println("====TESTE 3: Seller find all; ==== ");
        sellers = sellerDao.findAll();

        for (Seller s : sellers) {
            System.out.println(s);
        }
    }
}
