package com.interswitch.ajax.classwork;

import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlRootElement;
import jakarta.xml.bind.annotation.XmlAccessorType;

@XmlRootElement(name = "manager")
@XmlAccessorType(XmlAccessType.FIELD)
public class Manager {
  private String name;
  @XmlElement(name = "phone-number")
  private PhoneNumber phoneNumber;

  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public PhoneNumber getPhoneNumber() {
    return phoneNumber;
  }

  public void setPhoneNumber(PhoneNumber phoneNumber) {
    this.phoneNumber = phoneNumber;
  }

  @Override
  public String toString() {
    return "Manager {\n" +
            "\t\t\tname = '" + name + '\'' +
            ",\n\t\t\tphoneNumber = " + phoneNumber + "\n\t\t" +
            '}';
  }
}
