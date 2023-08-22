package com.interswitch.ajax;

import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlRootElement;

import java.util.ArrayList;
import java.util.List;

@XmlRootElement
public class Student {
  private String firstname;
  private String lastname;
  private String gender;
  List<Course> courses = new ArrayList<>();

  @XmlElement
  public String getFirstname() {
    return firstname;
  }

  public void setFirstname(String firstname) {
    this.firstname = firstname;
  }

  @XmlElement
  public String getLastname() {
    return lastname;
  }

  public void setLastname(String lastname) {
    this.lastname = lastname;
  }

  @XmlElement
  public String getGender() {
    return gender;
  }

  public void setGender(String gender) {
    this.gender = gender;
  }

  @XmlElement
  public List<Course> getCourses() {
    return courses;
  }

  public void setCourses(List<Course> courses) {
    this.courses = courses;
  }

  @Override
  public String toString() {
    return "Student {\n" +
            "\tfirstname='" + firstname + '\'' +
            ",\n\tlastname='" + lastname + '\'' +
            ",\n\tgender='" + gender + '\'' +
            ",\n\tcourses= " + courses +
            '}';
  }
}
