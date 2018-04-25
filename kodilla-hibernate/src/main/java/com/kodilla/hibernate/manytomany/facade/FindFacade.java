package com.kodilla.hibernate.manytomany.facade;

import com.kodilla.hibernate.manytomany.Company;
import com.kodilla.hibernate.manytomany.Employee;
import com.kodilla.hibernate.manytomany.dao.CompanyDao;
import com.kodilla.hibernate.manytomany.dao.EmployeeDao;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class FindFacade {

    private static final Logger LOGGER = LoggerFactory.getLogger(FindFacade.class);
    @Autowired
    CompanyDao companyDao;
    @Autowired
    EmployeeDao employeeDao;

    public List<Company> findNameOfCompanyByAnyPartOfName(String searchingPartOfText) {
        return companyDao.findNameOfCompanyByAnyPartOfName("%"+searchingPartOfText+"%");
    }

    public List<Employee> findNameOfEmployeeByAnyPartOfName(String searchingPartOfText) {
                return employeeDao.findByAnyPartOfName("%"+searchingPartOfText+"%");
    }
}
