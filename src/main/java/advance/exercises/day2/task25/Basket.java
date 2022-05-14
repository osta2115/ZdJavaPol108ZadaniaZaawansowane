package advance.exercises.day2.task25;

public class Basket {
    private int itemCounter;

    public Basket() {
        this.itemCounter = 0;
    }

    public void addToBasket() throws BasketFullException{
        if (itemCounter >= 10) {
            throw new BasketFullException("Too many items in the basket");
        }
        itemCounter++;
    }

    public void removeFromBasket() throws BasketEmptyException{
        if (itemCounter <= 0) {
            throw new BasketEmptyException("Can't remove from empty basket");
        }
        itemCounter--;
    }
}
