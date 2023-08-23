package com.interswitch.ajax;

import jakarta.xml.bind.Marshaller;
import jakarta.xml.bind.JAXBContext;
import jakarta.xml.bind.Unmarshaller;
import jakarta.xml.bind.JAXBException;

import java.io.File;
import java.io.StringWriter;

public class PersonMain {
  public static void main(String[] args) throws JAXBException {
    Person person = new Person();
    person.setName("James Femi-Oyetoro");
    person.setAddress("Abeokuta, Nigeria");

    JAXBContext context = JAXBContext.newInstance(Person.class);
    Marshaller marshaller = context.createMarshaller();

    StringWriter writer = new StringWriter();
    marshaller.marshal(person, writer);
    System.out.println(writer);

    /* Unmarshall */
    /* Person */
    Unmarshaller unmarshaller = context.createUnmarshaller();

    File file = new File("person.xml");

    Person person1 = (Person) unmarshaller.unmarshal(file);
    System.out.println(person1.toString());

    /* Person Courses */
    context = JAXBContext.newInstance(MapHelper.xmlMappingObjects);
    unmarshaller = context.createUnmarshaller();
    file = new File("student-course.xml");
    StudentCourse studentCourse = (StudentCourse) unmarshaller.unmarshal(file);
    person1.setMyCourse(studentCourse.getCourses());
    System.out.println(person1);
  }
}
