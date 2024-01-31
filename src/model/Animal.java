package model;

public class Animal {
    private Long id;
    private String name;
    private int age;
    private Gender gender;
    private static Long idInc = 1L;

    public Animal(String name, int age, Gender gender) {
        this.id = idInc++;
        this.name = name;
        this.age = age;
        this.gender = gender;
    }

    // Геттеры и другие методы...

    public Long getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public Gender getGender() {
        return gender;
    }

    @Override
    public String toString() {
        return "Animal{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", age=" + age +
                ", gender=" + gender +
                '}';
    }
}
