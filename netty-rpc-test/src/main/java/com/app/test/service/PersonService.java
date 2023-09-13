package com.app.test.service;

import java.util.List;

/**
 * @Author: Mr.Shan
 * @Version: v1.0
 */
public interface PersonService {
    List<Person> callPerson(String name, Integer num);
}
