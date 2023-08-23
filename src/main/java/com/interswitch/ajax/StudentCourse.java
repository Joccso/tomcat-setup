package com.interswitch.ajax;

import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlRootElement;
import jakarta.xml.bind.annotation.XmlAccessorType;

import java.util.ArrayList;

@XmlRootElement(name = "student-course")
@XmlAccessorType(XmlAccessType.FIELD)
public class StudentCourse {
  @XmlElement(name = "course")
  private ArrayList<Course> courses = new ArrayList<Course>();

  public ArrayList<Course> getCourses() {
    return courses;
  }

  public void setCourses(ArrayList<Course> courses) {
    this.courses = courses;
  }

  @Override
  public String toString() {
    return "StudentCourse {\n" +
            "\t\tcourses=" + courses +
            '}';
  }
}
