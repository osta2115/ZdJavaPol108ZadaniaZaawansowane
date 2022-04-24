package advance.exercises.day1.task4;

public class Main {
    public static void main(String[] args) {
       Storage storage = new Storage();

       storage.addToStorage("0", "value0_1");
       storage.addToStorage("1", "value1_1");
       storage.addToStorage("2", "value2_1");
       storage.addToStorage("2", "value2_2");
       storage.addToStorage("3", "value4_1");

       storage.printValues("2");
    }
}
