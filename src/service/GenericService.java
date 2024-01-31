package service;

import model.Gender;

import java.util.List;

public interface GenericService<T> {
    String add(List<T> list);
    T getById(Long id);
    List<T> getAll();
    List<T> sortByName();
    List<T> filterByGender(Gender gender);
    List<T> clear();

}
