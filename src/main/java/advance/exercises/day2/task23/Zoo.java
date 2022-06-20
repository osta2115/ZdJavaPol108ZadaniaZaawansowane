package advance.exercises.day2.task23;

import java.util.*;
import java.util.stream.Collectors;

public class Zoo {

    private List<Animal> animalsInZoo;

    public Zoo(List<Animal> animalsInZoo) {
        this.animalsInZoo = animalsInZoo;
    }

    public List<Animal> getAnimalsInZoo() {
        return animalsInZoo;
    }

    public  int getNumberOfAllAnimals() {
        return animalsInZoo.size();
    }

    public Map<Animal,Integer> getAnimalsCount() {
        Map<Animal,Integer> animalCount = new HashMap<>();

        for (Animal a : animalsInZoo) {
            if (animalCount.containsKey(a)){
                animalCount.put(a, animalCount.get(a) + 1);
            } else {
                animalCount.put(a, 1);
            }
        }
        return animalCount;
    }

//    public List<Map.Entry<Animal, Integer>> getAnimalsCountSorted() {
//        List<Map.Entry<Animal, Integer>> listPairs = new ArrayList<Map.Entry<String, Integer>>(this.getAnimalsCount().entrySet());
//        listPairs.sort(Comparator.comparing(Map.Entry::getValue));
//        return listPairs;
//    }

    void addAnimals(String name, int n) {
        for (int i = 0; i < n; i++) {
            animalsInZoo.add(new Animal(name));
        }
    }

    @Override
    public String toString() {
        return "Zoo{" +
                "animalsInZoo=" + animalsInZoo +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Zoo zoo = (Zoo) o;
        return Objects.equals(animalsInZoo, zoo.animalsInZoo);
    }

    @Override
    public int hashCode() {
        return Objects.hash(animalsInZoo);
    }
}

