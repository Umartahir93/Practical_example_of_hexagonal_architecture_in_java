package com.hexagonal;

public class PersonDaoDB implements PersonDaoInterface {
  public Person get(String ssn) {
    Person person = lookup(ssn);
    return person;
  }
}
