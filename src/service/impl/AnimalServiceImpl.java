package service.impl;

import model.Animal;
import model.Gender;
import service.GenericService;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class AnimalServiceImpl implements GenericService<Animal> {

    private List<Animal>animalList=new ArrayList<>();
    @Override
    public String add(List<Animal> newAnimal) {

        if (animalList.addAll(newAnimal)) {
            System.out.println(animalList);
            return "Animals added successfully";
        } else {
            return "Failed to add animals";
        }
    }

    @Override
    public Animal getById(Long id) {
        for (Animal animal:animalList){
            if (animal.getId().equals(id)){
                return animal;
            }
        }
        System.out.println("not found");
        return null;
    }

    @Override
    public List<Animal> getAll() {
        return animalList;
    }

    @Override
    public List<Animal> sortByName() {
        animalList.sort(Comparator.comparing(Animal::getName));
        return animalList;
    }

    @Override
    public List<Animal> filterByGender(Gender gender) {
        List<Animal>filteredAnimalList=new ArrayList<>();
        for (Animal animal:animalList){
            if (animal.getGender().equals(gender)){
                filteredAnimalList.add(animal);
            }
        }
        System.out.println(filteredAnimalList);
        return filteredAnimalList;
    }

    @Override
    public List<Animal> clear() {
        animalList.clear();
        return animalList;
    }
}
