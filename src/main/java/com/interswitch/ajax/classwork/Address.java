package com.interswitch.ajax.classwork;

import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlRootElement;
import jakarta.xml.bind.annotation.XmlAccessorType;

@XmlRootElement(name = "address")
@XmlAccessorType(XmlAccessType.FIELD)
public class Address {
//  @XmlElement(name = "city")
  private String city;
  @XmlElement(name = "house-no")
  private String houseNumber;
  @XmlElement(name = "postal-code")
  private String postalCode;
//  @XmlElement(name = "state")
  private String state;

  public String getCity() {
    return city;
  }

  public void setCity(String city) {
    this.city = city;
  }

  public String getHouseNumber() {
    return houseNumber;
  }

  public void setHouseNumber(String houseNumber) {
    this.houseNumber = houseNumber;
  }

  public String getPostalCode() {
    return postalCode;
  }

  public void setPostalCode(String postalCode) {
    this.postalCode = postalCode;
  }

  public String getState() {
    return state;
  }

  public void setState(String state) {
    this.state = state;
  }

  @Override
  public String toString() {
    return "Address {\n" +
            "\t\tcity='" + city + '\'' +
            ",\n\t\thouseNumber = '" + houseNumber + '\'' +
            ",\n\t\tpostalCode = '" + postalCode + '\'' +
            ",\n\t\tstate = '" + state + '\'' + '\n' + '\t' +
            '}';
  }
}
