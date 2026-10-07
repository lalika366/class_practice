package com.westminster.class_practice.demo.productapi;

public class Person {
  private int id;
  private String name;
  private String birthdate;


  public Person(int id, String name, String birthdate ){
    this.id = id;
    this.name = name;
    this.birthdate = birthdate;
  }

  public int getId() {
    return id;
  }

  public String getName() {
    return name;
  }

  public String getBirthdate(){
    return birthdate;
  }


  public int getAge() {
    return 2026 - Integer.parseInt(birthdate);
  }
}
