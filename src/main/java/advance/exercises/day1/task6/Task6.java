package advance.exercises.day1.task6;

import java.util.TreeMap;

public class Task6 {
    public static void main(String[] args) {
        TreeMap<String, Integer> treeMap = new TreeMap<>();
        treeMap.put("Real Madryt", 1);
        treeMap.put("Barcelona", 2);
        treeMap.put("Atleti", 3);
        treeMap.put("Sevilla", 4);

        printFirstAndLastElement(treeMap);

    }
    public static void printFirstAndLastElement(TreeMap<?, ?> map){
        System.out.println(map.firstEntry());
        System.out.println(map.lastEntry());
    }
}
