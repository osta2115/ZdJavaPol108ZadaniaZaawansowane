package advance.exercises.day1.extras.task2;

public class Person {

    private String name;
    private String surname;
    private Gender gender;
    private int age;

    public Person(String name, String surname, Gender gender, int age) {
        this.name = name;
        this.surname = surname;
        this.gender = gender;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public String getSurname() {
        return surname;
    }

    public Gender getGender() {
        return gender;
    }

    public int getAge() {
        return age;
    }

    @Override
    public String toString() {
        return new StringBuilder("")
                .append(name)
                .append(" ")
                .append(surname)
                .append(", age: ")
                .append(age)
                .append(", gender: ")
                .append(gender)
                .toString();
    }
}
