package application;

import model.dao.DaoFactory;
import model.dao.DepartmentDao;
import model.entities.Department;

public class Program2 {
    public static void main(String[] args){

        DepartmentDao departmentDao = DaoFactory.createDepartmentDao();

        System.out.println("====TESTE 1: Department find by id; ==== ");
        Department department = new Department(null,"Baby");
        departmentDao.insert(department);
        System.out.println("Inserido com sucesso.");

    }
}
