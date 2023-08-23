package com.interswitch.ajax;

import jakarta.xml.bind.JAXBContext;
import jakarta.xml.bind.Unmarshaller;
import jakarta.xml.bind.JAXBException;

import java.io.File;

public class Assessment {
  public static void main(String[] args) throws JAXBException {
    /* Get courses */
    JAXBContext context = JAXBContext.newInstance(Course.class);
    Unmarshaller unmarshaller = context.createUnmarshaller();
    File file = new File("course.xml");
    Course course = (Course) unmarshaller.unmarshal(file);

    /* Get Student */
    JAXBContext context1 = JAXBContext.newInstance(Student.class);
    unmarshaller = context1.createUnmarshaller();
    file = new File("student.xml");
    Student student = (Student) unmarshaller.unmarshal(file);
    /* Add Student Courses */
    student.getCourses().add(course);
    /* Print Student */
    System.out.println(student);
  }
}
