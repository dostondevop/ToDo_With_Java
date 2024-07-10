import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class MainV2 {

    private static final List<User> users = List.of(
            new User(1, "A", 2),
            new User(11, "AA", 2),
            new User(111, "AAA", 2),
            new User(1111, "AAAA", 2)
    );

    private static final List<Product> products = List.of(
            new Product(1, "A"),
            new Product(11, "AA"),
            new Product(111, "AAA"),
            new Product(1111, "AAA")
    );

    private static final List<Order> orders = List.of(
            new Order(1, 1),
            new Order(1, 11),
            new Order(111, 111),
            new Order(11, 1)
    );

    public static void main(String[] args) {
        Map<User, List<Product>> userProductMap = new HashMap<>();
        for (Order order: orders) {
            User user = user(order.getUserId());
            Product product = product(order.getProductId());
            List<Product> productList = userProductMap.getOrDefault(user, new ArrayList<>());
            productList.add(product);
            userProductMap.put(user, productList);
        }
        System.out.println(userProductMap);
    }

    private static User user(int userId) {
        for (User user: users) {
            if(user.getId() == userId) {
                return new User(user.getId(), user.getName(), user.getAge());
            }
        }
        return null;
    }

    private static Product product(int productId) {
        for (Product product: products) {
            if (product.getId() == productId) {
                return product;
            }
        }
        return null;
    }
}
