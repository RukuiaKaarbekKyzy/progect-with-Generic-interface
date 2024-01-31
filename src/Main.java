import model.Animal;
import model.Gender;
import model.Person;
import service.impl.AnimalServiceImpl;
import service.impl.PersonServiceImpl;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        PersonServiceImpl personService=new PersonServiceImpl();
        AnimalServiceImpl animalService=new AnimalServiceImpl();


        Scanner scanner=new Scanner(System.in);

        int choise;
        do {
            System.out.println("1.add Person");
            System.out.println("2.get By Id Person");
            System.out.println("3.get All Persons");
            System.out.println("4.sort By Name Persons");
            System.out.println("5.filter By Gender Persons");
            System.out.println("6.clear Persons");
            System.out.println("7.add Animal");
            System.out.println("8.get By Id Animal");
            System.out.println("9.get All Animals");
            System.out.println("10.sort By Name Animals");
            System.out.println("11.filter By Gender Animals");
            System.out.println("12.clear Animals");

            choise= scanner.nextInt();
            scanner.nextLine();
            switch (choise){
                case 1:
                    List<Person> personList = new ArrayList<>();
                    System.out.println("Enter person name:");
                    String name1=scanner.nextLine();
                    System.out.println("Enter person age:");
                    int age= scanner.nextInt();
                    scanner.nextLine();
                    System.out.println("Enter person gender(MALE,FEMALE,OTHER):");
                    String gender= scanner.nextLine();
                    Person newPerson=new Person(name1,age,Gender.valueOf(gender.toUpperCase()));
                    personList.add(newPerson);
                    personService.add(personList);
                    break;
                case 2:
                    System.out.println("Enter person id:");
                    Long id= scanner.nextLong();
                    System.out.println(personService.getById(id));
                    break;
                case 3:
                    System.out.println(personService.getAll());
                    break;
                case 4:
                    System.out.println(personService.sortByName());
                    break;
                case 5:
                    System.out.println("Enter person gender(MALE,FEMALE,OTHER):");
                    String gender2= scanner.nextLine();
                    personService.filterByGender(Gender.valueOf(gender2.toUpperCase()));
                    break;
                case 6:
                    personService.clear();
                    break;
                case 7:
                    List<Animal> animalList = new ArrayList<>();
                    System.out.println("Enter animal name:");
                    String name2=scanner.nextLine();
                    System.out.println("Enter animal age:");
                    int age1= scanner.nextInt();
                    scanner.nextLine();
                    System.out.println("Enter animal gender(MALE,FEMALE,OTHER):");
                    String gender1= scanner.nextLine();
                    Animal animal=new Animal(name2,age1,Gender.valueOf(gender1.toUpperCase()));
                    animalList.add(animal);
                    animalService.add(animalList);
                    break;
                case 8:
                    System.out.println("Enter animal id:");
                    Long id1= scanner.nextLong();
                    System.out.println(animalService.getById(id1));
                    break;
                case 9:
                    System.out.println(animalService.getAll());
                    break;
                case 10:
                    System.out.println(animalService.sortByName());
                    break;
                case 11:
                    System.out.println("Enter animal gender(MALE,FEMALE,OTHER):");
                    String gender3= scanner.nextLine();
                    animalService.filterByGender(Gender.valueOf(gender3.toUpperCase()));
                    break;
                case 12:
                    animalService.clear();
                    break;
                case 0:
                    break;
            }
        }while (true);


    }
}