package com.hexagonal;

import java.util.HashMap;

public class PersonDaoFake implements PersonDaoInterface {
  private final HashMap<String, Person> persons = new HashMap<>();

  // Constructor goes here
  public Person get(String ssn) {
    if (persons.containsKey(ssn)) {
      return persons.get(ssn);
    }
    return null;
  }
}
