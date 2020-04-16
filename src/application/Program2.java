package application;

import model.dao.DaoFactory;
import model.dao.DepartmentDao;
import model.entities.Department;

import java.util.List;

public class Program2 {
    public static void main(String[] args){

        DepartmentDao departmentDao = DaoFactory.createDepartmentDao();

        //System.out.println("====TESTE 1: Department find by id; ==== ");
        //Department department = new Department(null,"Baby");
        //departmentDao.insert(department);
        //System.out.println("Inserido com sucesso.");

        System.out.println("====TESTE 2: Department Update; ==== ");
        Department department1 = new Department(1,"Computador");
        departmentDao.update(department1);
        System.out.println("Atualização Completa!");

        //System.out.println("====TESTE 3: Department Delete; ==== ");
        //departmentDao.deleteById(9);

        System.out.println("====TESTE 4: Department Find by id; ==== ");
        System.out.println(departmentDao.findById(3));

        System.out.println("====TESTE 5: Department Find all; ==== ");
        List<Department> departments = departmentDao.findAll();

        for (Department department : departments) {
            System.out.println(department);
        }


    }
}
