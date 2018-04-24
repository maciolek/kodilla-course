package com.kodilla.hibernate.manytomany.facade;

import com.kodilla.hibernate.manytomany.Company;
import com.kodilla.hibernate.manytomany.Employee;
import com.kodilla.hibernate.manytomany.dao.CompanyDao;
import com.kodilla.hibernate.manytomany.dao.EmployeeDao;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Transactional
@RunWith(SpringRunner.class)
@SpringBootTest
public class FindFacadeTestSuit {
    private static String LASTNAME1 = "Kowalski";
    private static String LASTNAME2 = "Nowak";
    private static String COMPANY1 = "Microsoft";
    private static String COMPANY2 = "Apple";
    @Autowired
    CompanyDao companyDao;
    @Autowired
    EmployeeDao employeeDao;
    @Autowired
    FindFacade findFacade;

    @Before
    public void createDatebase() {
        Employee johnKowalski = new Employee("John", LASTNAME1);
        Employee stephanieNowak = new Employee("Stephanie", LASTNAME2);
        Employee stefanNowak = new Employee("Stefan", LASTNAME2);

        Company microsoft = new Company(COMPANY1);
        Company apple = new Company(COMPANY2);


        apple.getEmployees().add(johnKowalski);
        apple.getEmployees().add(stephanieNowak);
        microsoft.getEmployees().add(stefanNowak);

        johnKowalski.getCompanies().add(apple);
        stephanieNowak.getCompanies().add(apple);
        stefanNowak.getCompanies().add(microsoft);

        companyDao.save(apple);
        companyDao.save(microsoft);
    }

    @Test
    public void testFindByAnyPartOfNameCompany() {
        //given

        //when
        List<Company> companies = findFacade.findNameOfCompanyByAnyPartOfName("soft");
        //then
        Assert.assertEquals(1, companies.size());
        Assert.assertTrue(companies.get(0).getName().equals(COMPANY1));
    }

    @Test
    public void testFindByAnyPartOfNameEmployee() {
        //given

        //when
        List<Employee> employees = findFacade.findNameOfEmployeeByAnyPartOfName("owa");
        //then
        Assert.assertEquals(3, employees.size());
    }
}
