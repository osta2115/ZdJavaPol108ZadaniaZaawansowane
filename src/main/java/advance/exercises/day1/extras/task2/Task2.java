package advance.exercises.day1.extras.task2;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

public class Task2 {
    public static void main(String[] args) {

        List<String> firstProgrammerList = new ArrayList<>();
        List<String> secondProgrammerList = new ArrayList<>();
        List<String> thirdProgrammerList = new ArrayList<>();
        List<String> fourthProgrammerList = new ArrayList<>();
        List<String> fifthProgrammerList = new ArrayList<>();
        List<String> sixthProgrammerList = new ArrayList<>();

        Programmer programmer1 = new Programmer(new Person("Jan", "Kowalski", Gender.MALE, 26), firstProgrammerList);
        Programmer programmer2 = new Programmer(new Person("Anna", "Nowak", Gender.FEMALE, 17), secondProgrammerList);
        Programmer programmer3 = new Programmer(new Person("Maryla", "Rodowicz", Gender.FEMALE, 76), thirdProgrammerList);
        Programmer programmer4 = new Programmer(new Person("Marek", "Konrad", Gender.MALE, 15), fourthProgrammerList);
        Programmer programmer5 = new Programmer(new Person("Adam", "Małysz", Gender.MALE, 44), fifthProgrammerList);
        Programmer programmer6 = new Programmer(new Person("Agnieszka", "Radwańska", Gender.FEMALE, 33), sixthProgrammerList);

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

        List<Programmer> programmersList = new ArrayList<>();

        programmersList.add(programmer1);
        programmersList.add(programmer2);
        programmersList.add(programmer3);
        programmersList.add(programmer4);
        programmersList.add(programmer5);
        programmersList.add(programmer6);

        System.out.println("Only male programmers:");
        System.out.println(onlyMaleProgrammers(programmersList));
        separatingLine();

        System.out.println("Underage programmers:");
        System.out.println(underageProgrammersCodingInJava(programmersList));
        separatingLine();

        System.out.println("More then one languages programmers:");
        System.out.println(programmersKnowsMoreThanOneLanguage(programmersList));
        separatingLine();

        System.out.println("Female programmers knows C# and Java:");
        System.out.println(femaleProgrammersKnowsCHAndJava(programmersList));
        separatingLine();

        System.out.println("List of male names:");
        System.out.println(maleNamesOfProgrammers(programmersList));
        separatingLine();

        System.out.println("Set of languages known by programmers:");
        System.out.println(languagesKnownByProgrammers(programmersList));
        separatingLine();

        System.out.println("List of surnames of programmers whose know more than 2 languages:");
        System.out.println(surnamesOfProgrammersWhoseKnowsMoreThanTwoLanguages(programmersList));
        separatingLine();

        System.out.println("Is there a programmer who doesn't know any language?");
        System.out.println(isThereProgrammerWhoDoesntKnowAnyLanguage(programmersList));
        separatingLine();

        System.out.println("Number of languages known by female programmers:");
        System.out.println(numberOfLanguagesKnownByFemaleProgrammers(programmersList));
        separatingLine();
    }

    public static List<Programmer> onlyMaleProgrammers (List<Programmer> programmers) {
        return programmers.stream()
                .filter(programmer -> programmer.getPerson().getGender() == Gender.MALE)
                .collect(Collectors.toList());
    }

    public static List<Programmer> underageProgrammersCodingInJava(List<Programmer> programmers) {
        return programmers.stream()
                .filter(programmer -> programmer.getPerson().getAge() < 18)
                .filter(programmer -> programmer.getLanguages().contains("Java"))
                .collect(Collectors.toList());
    }

    public static List<Programmer> programmersKnowsMoreThanOneLanguage(List<Programmer> programmers) {
        return programmers.stream()
                .filter(programmer -> programmer.getLanguages().size() > 1)
                .collect(Collectors.toList());
    }

    public static List<Programmer> femaleProgrammersKnowsCHAndJava(List<Programmer> programmers) {
        return programmers.stream()
                .filter(programmer -> programmer.getPerson().getGender() == Gender.FEMALE)
                .filter(programmer -> programmer.getLanguages().contains("Java") &&
                        programmer.getLanguages().contains("C#"))
                .collect(Collectors.toList());
    }

    public static List<String> maleNamesOfProgrammers(List<Programmer> programmers) {
        return programmers.stream()
                .filter(programmer -> programmer.getPerson().getGender() == Gender.MALE)
                .map(Programmer -> Programmer.getPerson().getName())
                .collect(Collectors.toList());
    }

    public static Set<String> languagesKnownByProgrammers(List<Programmer> programmers) {
        return programmers.stream()
                .map(Programmer::getLanguages)
                .flatMap(List::stream)
                .collect(Collectors.toSet());
    }

    public static List<String> surnamesOfProgrammersWhoseKnowsMoreThanTwoLanguages(List<Programmer> programmers) {
        return programmers.stream()
                .filter(programmer -> programmer.getLanguages().size() > 2)
                .map(Programmer -> Programmer.getPerson().getSurname())
                .collect(Collectors.toList());
    }

    public static boolean isThereProgrammerWhoDoesntKnowAnyLanguage(List<Programmer> programmers) {
        programmers.stream()
                .filter(programmer -> programmer.getLanguages().size() == 0)
                .collect(Collectors.toList());
        if (programmers.size() > 0){
            return true;
        }
        return false;
    }

    public static Integer numberOfLanguagesKnownByFemaleProgrammers(List<Programmer> programmers) {
        return Math.toIntExact(programmers.stream()
                .filter(programmer -> programmer.getPerson().getGender() == Gender.FEMALE)
                .filter(programmer -> !programmer.getLanguages().isEmpty())
                .map(Programmer::getLanguages)
                .distinct()
                .count());
    }


    public static void separatingLine() {
        System.out.println("===========================================================================================");
        System.out.println("===========================================================================================");
    }
}
