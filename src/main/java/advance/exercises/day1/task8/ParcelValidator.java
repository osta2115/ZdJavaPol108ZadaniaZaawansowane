package advance.exercises.day1.task8;

public class ParcelValidator implements Validator {

    private static final int SINGLE_MIN_LENGTH = 30;
    private static final int SUM_MAX = 300;
    private static final float MAX_WEIGHT_FOR_EXPRESS = 15f;
    private static final float MAX_WEIGHT_FOR_NON_EXPRESS = 15f;

    @Override
    public boolean validate(Parcel input) {
        return isSumOfZYXCorrect(input) && isEachDimensionCorrect(input)
                && isWeightCorrect(input);
    }

    private boolean isSumOfZYXCorrect(Parcel input) {
        return input.getXLength() + input.getYLength()
                + input.getZLength() <= SUM_MAX;
    }
    private boolean isEachDimensionCorrect(Parcel input) {

        return input.getXLength() >= SINGLE_MIN_LENGTH && input.getYLength() >= SINGLE_MIN_LENGTH
                && input.getZLength() >= SINGLE_MIN_LENGTH;
    }
    private boolean isWeightCorrect(Parcel input) {
        return (input.isExpress && input.getWeight() <= MAX_WEIGHT_FOR_EXPRESS
        || !input.isExpress && input.getWeight() <= MAX_WEIGHT_FOR_NON_EXPRESS);

    }
}
