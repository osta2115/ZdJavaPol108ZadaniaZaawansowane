package advance.exercises.day1.extras.task3;

import java.time.LocalDate;
import java.util.List;
import java.util.Objects;

public class Order {

    private Long id;
    private LocalDate orderDate;
    private List<Product> products;

    public Order(Long id, LocalDate orderDate, List<Product> products) {
        this.id = id;
        this.orderDate = orderDate;
        this.products = products;
    }

    public Long getId() {
        return id;
    }

    public LocalDate getOrderDate() {
        return orderDate;
    }

    public List<Product> getProducts() {
        return products;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Order order = (Order) o;
        return Objects.equals(id, order.id) && Objects.equals(orderDate, order.orderDate) && Objects.equals(products, order.products);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, orderDate, products);
    }

    @Override
    public String toString() {
        return "Order{" +
                "id=" + id +
                ", orderDate=" + orderDate +
                ", products=" + products +
                '}';
    }
}
