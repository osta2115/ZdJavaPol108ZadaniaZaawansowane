package advance.exercises.day3.task28;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

public class Task28<E> extends ArrayList<E> {

//    public Task28(Collection<? extends E> c) {
//        super(c);
//    }


    public Task28() {
    }

    public List<E> getEveryNthElement(int startIndex, int skip) {
        List<E> everyNthElement = new ArrayList<>();
        //int currentIndex = startIndex;
        for (int currentIndex = startIndex; currentIndex < size(); currentIndex += skip + 1) {
            everyNthElement.add(get(currentIndex));
        }
        return everyNthElement;
    }
}
