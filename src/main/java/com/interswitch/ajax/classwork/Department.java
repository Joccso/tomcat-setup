package com.interswitch.ajax.classwork;

import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlRootElement;
import jakarta.xml.bind.annotation.XmlAccessorType;

@XmlRootElement(name = "address")
@XmlAccessorType(XmlAccessType.FIELD)
public class Department {
//  @XmlElement(name = "name")
  private String name;
//  @XmlElement(name = "manager")
  private Manager manager;

//  @XmlElement(name = "manager")
//  private Employee manager;

  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public Manager getManager() {
    return manager;
  }

  public void setManager(Manager manager) {
    this.manager = manager;
  }

  @Override
  public String toString() {
    return "Department {\n" +
            "\t\tname = '" + name + '\'' +
            ",\n\t\tmanager = " + manager + '\n' + '\t' +
            '}';
  }
}
