package com.interswitch.ajax.classwork;

import jakarta.xml.bind.JAXBContext;
import jakarta.xml.bind.Unmarshaller;
import jakarta.xml.bind.JAXBException;
import org.json.JSONArray;
import org.json.JSONObject;

import java.io.File;
import java.util.ArrayList;
import java.util.List;

public class EmployeeMain {
  public static void main(String[] args) throws JAXBException {
    JAXBContext context = JAXBContext.newInstance(EmployeeMapHelper.xmlMappingObjects);
    Unmarshaller unmarshaller = context.createUnmarshaller();
    File file = new File("employee.xml");
    Employee employee = (Employee) unmarshaller.unmarshal(file);
    System.out.println(employee);
    /* Convert employee to Json object */
    JSONObject jsonObject = new JSONObject(employee);
    System.out.println(jsonObject);
    Employee employee1 = (Employee) unmarshaller.unmarshal(file);
    Employee employee2 = (Employee) unmarshaller.unmarshal(file);
    /* Convert employee list to Json array */
//    List<String> employeeList = new ArrayList<>();
//    employeeList.add(employee.toString());
//    employeeList.add(employee1.toString());
//    employeeList.add(employee2.toString());
//    JSONArray jsonArray = new JSONArray(employeeList);
    JSONArray jsonArray = new JSONArray(List.of(employee, employee1, employee2));
    System.out.println(jsonArray);
    for (int i = 0; i < jsonArray.length(); i++) {
      System.out.println(jsonArray.get(i));
    }
  }
}
