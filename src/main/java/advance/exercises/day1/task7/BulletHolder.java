package advance.exercises.day1.task7;

import java.util.ArrayDeque;
import java.util.Deque;

public class BulletHolder {
    private final Deque<String> bulletHolder = new ArrayDeque<>();
    private final int maxNumberOfBullet;

    public BulletHolder(int maxNumberOfBullet) {
        this.maxNumberOfBullet = maxNumberOfBullet;
    }

    public void loadBullet(String bullet) {
        if (maxNumberOfBullet == bulletHolder.size()) {
            throw new IllegalArgumentException("Holder is full");
        }
        bulletHolder.push(bullet);
    }

//    public boolean loadBullet() {
//        if (maxNumberOfBullet == bulletHolder.size()) {
//            return false;
//        }
//        bulletHolder.push(bullet);
//        return true;
//    }

    public boolean isLoaded() {
        return bulletHolder.size() >= 1;
    }

    public String shot() {
        if (!isLoaded()){
            return "Holder is empty";
        } else {
            return bulletHolder.pop();
        }
    }
}
