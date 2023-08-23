package com.interswitch.ajax.classwork;

import jakarta.xml.bind.JAXBContext;
import jakarta.xml.bind.Unmarshaller;
import jakarta.xml.bind.JAXBException;

import java.io.File;

public class EmployeeMain {
  public static void main(String[] args) throws JAXBException {
    JAXBContext context = JAXBContext.newInstance(Employee.class);
    Unmarshaller unmarshaller = context.createUnmarshaller();
    File file = new File("employee.xml");
    Employee employee = (Employee) unmarshaller.unmarshal(file);
    System.out.println(employee);
  }
}
