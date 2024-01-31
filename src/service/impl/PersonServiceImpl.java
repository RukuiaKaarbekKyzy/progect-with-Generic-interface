package service.impl;

import model.Gender;
import model.Person;
import service.GenericService;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class PersonServiceImpl implements GenericService<Person> {
    private List<Person> personList = new ArrayList<>();
    @Override
    public String add(List<Person> newPersons) {
        if (personList.addAll(newPersons)) {
            System.out.println(personList);
            return "Persons added successfully";
        } else {
            return "Failed to add persons";
        }
    }


    @Override
    public Person getById(Long id) {
        for (Person person:personList){
            if (person.getId()==id){
                return person;
            }
        }
        System.out.println("not found");
        return null;
    }

    @Override
    public List<Person> getAll() {
        return personList;
    }

    @Override
    public List<Person> sortByName() {
      personList.sort(Comparator.comparing(Person::getName));
      return personList;

    }

    @Override
    public List<Person> filterByGender(Gender gender) {
        List<Person>filteredPersons=new ArrayList<>();
        for (Person person:personList){
            if (person.getGender().equals(gender)){
                filteredPersons.add(person);
            }

        }
        System.out.println(filteredPersons);
        return filteredPersons;
    }

    @Override
    public List<Person> clear() {
        personList.clear();
        return personList;
    }
}
