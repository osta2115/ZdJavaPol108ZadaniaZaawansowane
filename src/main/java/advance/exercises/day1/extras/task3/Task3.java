package advance.exercises.day1.extras.task3;

import java.time.LocalDate;
import java.util.Comparator;
import java.util.List;
import java.util.OptionalDouble;
import java.util.stream.Collectors;

public class Task3 {
    public static List<Product> pointA(List<Product> products) {
      return products.stream()
                .filter(product -> product.getCategory().equals("Computer"))
                .filter(product -> product.getPrice() > 5000d)
                .collect(Collectors.toList());
    }

    public static List<Product> pointB(List<Product> products) {
        return products.stream()
                .filter(product -> product.getCategory().equals("Computer"))
                .map(product -> new Product(product.getId(), product.getName(),
                        product.getCategory(), product.getPrice()*0.8))
                .collect(Collectors.toList());
    }

    public static Product pointC(List<Product> products) {
        return products.stream()
                .filter(product -> product.getCategory().equals("Computer"))
                .min(Comparator.comparing(Product::getPrice))
                .get();
    }

    public static List<Order> pointD(List<Order> orders) {
        return orders.stream()
                .filter(order -> order.getProducts().stream()
                        .anyMatch(product -> product.getCategory().equals("Book")))
                .collect(Collectors.toList());
    }

   public static List<Product> pointE(List<Order> orders) {
        return orders.stream()
                .filter(order -> order.getOrderDate().compareTo(LocalDate.of(2022,1,1)) >= 0)
                .filter(order -> order.getOrderDate().compareTo(LocalDate.of(2022,2,1)) <= 0)
                .flatMap(order -> order.getProducts().stream())
                .distinct()
                .collect(Collectors.toList());
   }

   public static List<Order> pointF(List<Order> orders) {
        return orders.stream()
                .sorted(Comparator.comparing(Order::getOrderDate).reversed())
                .limit(2)
                .collect(Collectors.toList());
   }

   public static double pointG(List<Order> orders) {
        return orders.stream()
                .sorted(Comparator.comparing(Order::getOrderDate))
                .limit(1)
                .flatMap(order -> order.getProducts().stream())
                .mapToDouble(Product::getPrice)
                .sum();
   }
}
