package com.interswitch.ajax;

import jakarta.xml.bind.Marshaller;
import jakarta.xml.bind.JAXBContext;
import jakarta.xml.bind.JAXBException;

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
    System.out.println(writer.toString());
  }
}
