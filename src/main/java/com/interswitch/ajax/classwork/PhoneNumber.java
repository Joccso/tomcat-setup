package com.interswitch.ajax.classwork;

import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlRootElement;
import jakarta.xml.bind.annotation.XmlAccessorType;

@XmlRootElement(name = "phone-number")
@XmlAccessorType(XmlAccessType.FIELD)
public class PhoneNumber {
//  @XmlElement(name = "work")
  private Long work;
//  @XmlElement(name = "home")
  private Long home;

  public Long getWork() {
    return work;
  }

  public void setWork(Long work) {
    this.work = work;
  }

  public Long getHome() {
    return home;
  }

  public void setHome(Long home) {
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
