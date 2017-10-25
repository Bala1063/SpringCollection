/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.sprco;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 *
 * @author BA391760
 */
public class SpringCollectionTest1 {
    public static void main(String args[])
    {
        ApplicationContext context=new ClassPathXmlApplicationContext("springCollections.xml");
       Employee employee=context.getBean(Employee.class);
        System.out.println(employee.getEmpid());
        System.out.println(employee.getName());
        System.out.println(employee.getJob());
        System.out.println(employee.getAddr().getStreet()+" "+employee.getAddr().getLocation());
        Department department=context.getBean(Department.class);
        System.out.println(department.getName());
        System.out.println(department.getLocation());
        System.out.println(department.getJobs());
        
    }
    
}
