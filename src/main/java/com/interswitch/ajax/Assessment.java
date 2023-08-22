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
    Unmarshaller unMarshallerOne = context1.createUnmarshaller();
    File file1 = new File("student.xml");
    Student student = (Student) unMarshallerOne.unmarshal(file1);
    /* Add Student Courses */
    student.getCourses().add(course);
    /* Print Student */
    System.out.println(student);
  }
}
