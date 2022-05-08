package advance.exercises.day1.extras.task2;

import java.util.ArrayList;
import java.util.List;

public class Programmer{
    private  Person person;
    private List<String> languages;

    public Programmer(Person person, List<String> languages) {
        this.person = person;
        this.languages = languages;
    }

    public Person getPerson() {
        return person;
    }

    public List<String> getLanguages() {
        return languages;
    }


    @Override
    public String toString() {
        return new StringBuilder("Programmer: ")
                .append(person)
                .append(" - languages: ")
                .append(languages)
                .toString();
    }
}
