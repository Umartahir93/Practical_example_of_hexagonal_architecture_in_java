package com.hexagonal;

public class HttpAPI implements APIInterface {
  private final PersonService service;

  public HttpAPI(PersonService service) {
    this.service = service;
  }

  public Person get(String ssn) {
    return service.search(ssn);
  }
}
