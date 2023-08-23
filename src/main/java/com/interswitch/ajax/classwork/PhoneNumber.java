package com.interswitch.ajax.classwork;

import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlRootElement;
import jakarta.xml.bind.annotation.XmlAccessorType;

@XmlRootElement(name = "phone-number")
@XmlAccessorType(XmlAccessType.FIELD)
public class PhoneNumber {
  private String work;
  private String home;

  public String getWork() {
    return work;
  }

  public void setWork(String work) {
    this.work = work;
  }

  public String getHome() {
    return home;
  }

  public void setHome(String home) {
    this.home = home;
  }

  @Override
  public String toString() {
    return "PhoneNumber {\n" +
            "\t\t\t\twork = " + work +
            ",\n\t\t\t\thome = " + home + "\n\t\t\t" +
            '}';
  }
}
