package ru.stqa.pft.addressbook.model;

public class UserData {
  private final String firstname;
  private final String lastname;
  private final String company;
  private final String phone;
  private final String email;

  public UserData(String firstname, String lastname, String company, String phone, String email) {
    this.firstname = firstname;
    this.lastname = lastname;
    this.company = company;
    this.phone = phone;
    this.email = email;
  }

  public String getFirstname() {
    return firstname;
  }

  public String getLastname() {
    return lastname;
  }

  public String getCompany() {
    return company;
  }

  public String getPhone() {
    return phone;
  }

  public String getEmail() {
    return email;
  }
}
