package com.hexagonal;

public class PersonService {
  private final PersonDaoInterface personDao;

  public PersonService(PersonDaoInterface personDao) {
    this.personDao = personDao;
  }

  public Person search(String ssn) {
    return personDao.get(ssn);
  }
}
