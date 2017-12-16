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
public final class Facade {

    @Autowired
    private CompanyDao companyDao;

    @Autowired
    private EmployeeDao employeeDao;

    private static final Logger LOGGER = LoggerFactory.getLogger(Facade.class);

    public List<Company> showCompanyWith(String name)  {
        LOGGER.info("Start searching company with name like : " + name);
        List<Company> list = companyDao.retrieveCompanyWith(name);
        LOGGER.info("Stop searching");

        return list;
    }

    public List<Employee> showEmployeeWith(String name)  {
        LOGGER.info("Start searching employees with name like : " + name);
        List<Employee> list = employeeDao.retrieveEmployeesWith(name);
        LOGGER.info("Stop searching");

        return list;
    }
}
