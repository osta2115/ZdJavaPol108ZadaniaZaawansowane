package advance.exercises.day1.extras.task2;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;

import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.jupiter.api.Assertions.*;

class Task2Test {

    List<Programmer> programmersList = new ArrayList<>();
    Programmer programmer1;
    Programmer programmer2;
    Programmer programmer3;
    Programmer programmer4;
    Programmer programmer5;
    Programmer programmer6;

    @BeforeEach
    void setup() {
        List<String> firstProgrammerList = new ArrayList<>();
        List<String> secondProgrammerList = new ArrayList<>();
        List<String> thirdProgrammerList = new ArrayList<>();
        List<String> fourthProgrammerList = new ArrayList<>();
        List<String> fifthProgrammerList = new ArrayList<>();
        List<String> sixthProgrammerList = new ArrayList<>();

        programmer1 = new Programmer(new Person("Jan", "Kowalski", Gender.MALE, 26), firstProgrammerList);
        programmer2 = new Programmer(new Person("Anna", "Nowak", Gender.FEMALE, 17), secondProgrammerList);
        programmer3 = new Programmer(new Person("Maryla", "Rodowicz", Gender.FEMALE, 76), thirdProgrammerList);
        programmer4 = new Programmer(new Person("Marek", "Konrad", Gender.MALE, 15), fourthProgrammerList);
        programmer5 = new Programmer(new Person("Adam", "Małysz", Gender.MALE, 44), fifthProgrammerList);
        programmer6 = new Programmer(new Person("Agnieszka", "Radwańska", Gender.FEMALE, 33), sixthProgrammerList);

        firstProgrammerList.add("Java");
        firstProgrammerList.add("C++");
        firstProgrammerList.add("Javascript");

        secondProgrammerList.add("C#");
        secondProgrammerList.add("Java");

        thirdProgrammerList.add("Java");

        fourthProgrammerList.add("CSS");
        fourthProgrammerList.add("PHP");
        fourthProgrammerList.add("HTML");

        fifthProgrammerList.add("Python");


        programmersList.add(programmer1);
        programmersList.add(programmer2);
        programmersList.add(programmer3);
        programmersList.add(programmer4);
        programmersList.add(programmer5);
        programmersList.add(programmer6);
    }

    @Test
    void shouldReturnOnlyMaleProgrammers() {
        //when
        List<Programmer> actualResult = Task2.onlyMaleProgrammers(programmersList);
        //then
        assertThat(actualResult).containsExactlyInAnyOrder(programmer1, programmer4, programmer5);
    }

    @Test
    void shouldReturnUnderageProgrammersCodingInJava() {
        //when
        List<Programmer> actualResult = Task2.underageProgrammersCodingInJava(programmersList);
        //then
        assertThat(actualResult).containsExactlyInAnyOrder(programmer2);
    }

    @Test
    void shouldReturnProgrammersWithMoreThanOneLanguages() {
        //when
        List<Programmer> actualResult = Task2.programmersKnowsMoreThanOneLanguage(programmersList);
        //then
        assertThat(actualResult).containsExactlyInAnyOrder(programmer1, programmer2, programmer4);
    }

    @Test
    void shouldReturnFemaleProgrammersKnowsJavaAndCH() {
        //when
        List<Programmer> actualResult = Task2.femaleProgrammersKnowsCHAndJava(programmersList);
        //then
        assertThat(actualResult).containsExactlyInAnyOrder(programmer2);
    }

    @Test
    void shouldReturnListOfMaleNames() {
        //when
        List<String> actualResult = Task2.maleNamesOfProgrammers(programmersList);
        //then
        assertThat(actualResult).containsExactlyInAnyOrder("Jan", "Adam", "Marek");
    }

    @Test
    void shouldReturnSetOfAllLanguages() {
        //when
        Set<String> actualResult = Task2.languagesKnownByProgrammers(programmersList);
        //then
        assertThat(actualResult).containsExactlyInAnyOrder(
                "Java", "CSS", "HTML", "Javascript", "C#", "Python", "C++", "PHP");
    }

    @Test
    void shouldReturnSurnamesOfProgrammersWhoseKnowMoreThanTwoLanguages() {
        //when
        List<String> actualResult = Task2.surnamesOfProgrammersWhoseKnowsMoreThanTwoLanguages(programmersList);
        //then
        assertThat(actualResult).containsExactlyInAnyOrder("Kowalski", "Konrad");
    }

    @Test
    void shouldReturnNieWiemJakNazwac() {
        //when
        boolean actualResult = Task2.isThereProgrammerWhoDoesntKnowAnyLanguage(programmersList);
        //then
        assertThat(actualResult).isTrue();
    }

    @Test
    void shouldReturnnumberOfLanguagesKnownByFemaleProgrammers() {
        //when
        Integer actualResult = Task2.numberOfLanguagesKnownByFemaleProgrammers(programmersList);
        //then
        assertThat(actualResult).isEqualTo(2);
    }

}