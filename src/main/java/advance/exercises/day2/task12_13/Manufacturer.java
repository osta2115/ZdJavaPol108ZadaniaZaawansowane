package advance.exercises.day2.task12_13;

import java.time.LocalDate;
import java.util.Objects;

public class Manufacturer {
    private String name;
    private int yearOfFounded;
    private String country;

    public Manufacturer(String name, int yearOfFounded, String country) {
        this.name = name;
        this.yearOfFounded = yearOfFounded;
        this.country = country;
    }

    public String getName() {
        return name;
    }

    public int getYearOfFounded() {
        return yearOfFounded;
    }

    public String getCountry() {
        return country;
    }

    @Override
    public String toString() {
        return "Manufacturer{" +
                "name='" + name + '\'' +
                ", yearOfFounded=" + yearOfFounded +
                ", country='" + country + '\'' +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Manufacturer that = (Manufacturer) o;
        return Objects.equals(name, that.name) && Objects.equals(yearOfFounded, that.yearOfFounded) && country == that.country;
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, yearOfFounded, country);
    }
}
