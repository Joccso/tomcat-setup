package com.interswitch.ajax;

import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlRootElement;

import java.util.List;
import java.util.ArrayList;

@XmlRootElement
public class Person {
  private String name;
  private String address;
  private List<Course> myCourse = new ArrayList<>();

  public List<Course> getMyCourse() {
    return myCourse;
  }

  public void setMyCourse(List<Course> myCourse) {
    this.myCourse = myCourse;
  }

  @XmlElement
  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  @XmlElement
  public String getAddress() {
    return address;
  }

  public void setAddress(String address) {
    this.address = address;
  }

  @Override
  public String toString() {
    return "Person{" +
            "name='" + name + '\'' +
            ", address='" + address + '\'' +
            ", myCourse=" + myCourse +
            '}';
  }
}
