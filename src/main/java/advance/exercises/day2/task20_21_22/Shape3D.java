package advance.exercises.day2.task20_21_22;

public abstract class Shape3D extends Shape implements Fillable{
    abstract double calculateVolume();

    @Override
    public int fill(double value) {
        return Double.compare(value,calculateVolume());
//        if (value > calculateVolume()){
//            return 1;
//        } else if (value == calculateVolume()){
//            return 0;
//        } else
//            return -1;
    }
}
