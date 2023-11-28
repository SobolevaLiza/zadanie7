import BuilderMethod.Order;

public class Main {
    public static void main(String[] args) {
        Order order = new Order.OrderBuilder(12421,"food","Voronezh",999).setCount(10).build();
    }
}
