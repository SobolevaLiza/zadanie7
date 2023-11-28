package BuilderMethod;

public class Order {
    Integer code;
    String stuff;
    String address;
    Integer price;
    Integer count;

    public Order(OrderBuilder orderBuilder) {
        code = orderBuilder.code;
        stuff = orderBuilder.stuff;
        address = orderBuilder.address;
        price = orderBuilder.price;
        count = orderBuilder.count;
    }

    public static class OrderBuilder {
        Integer code;
        String stuff;
        String address;
        Integer price;

        Integer count;



        public OrderBuilder(Integer code, String stuff, String address,Integer price) {
            this.code = code;
            this.stuff = stuff;
            this.address = address;
            this.price = price;
        }

        public OrderBuilder setCount(Integer count) {
            this.count = count;
            return this;
        }


        public Order build() {
            return new Order(this);
        }
    }
}
