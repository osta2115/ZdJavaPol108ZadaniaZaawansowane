package advance.exercises.day2.task15;

import java.util.Set;

public enum Car {
    FERRARI(500000, 350),
    PORSCHE(400000, 300),
    MERCEDES(375000, 285),
    BMW(400000, 290),
    OPEL(100000, 150),
    FIAT(30000,86),
    TOYOTA(90000, 105);

    private final double price;
    private final int power;
    private final static Set<Car> premiumCars = Set.of(FERRARI,PORSCHE,MERCEDES,BMW);

    Car(double price, int power) {
        this.price = price;
        this.power = power;
    }

    public static boolean isPremium(Car car) {
        return premiumCars.contains(car);
    }

    public boolean isPremium() {
        return premiumCars.contains(this);
    }

    public static boolean isRegular(Car car) {
        return !isPremium(car);
    }


    public boolean isRegular() {
        return !isPremium();
    }

    public boolean isFasterThan(Car car) {
        return this.compareTo(car) < 0;
    }
}
