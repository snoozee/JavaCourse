package coffee.order;

import java.util.logging.Logger;

public class Order {
    private static final Logger logger = Logger.getLogger(Order.class.getName());
    private int number;
    private String name;

    public Order(int number, String name) {
        this.number = number;
        this.name = name;

        logger.info("Order " + number + " created for " + name);
    }

    public int getNumber() {
        logger.info("Getting order number: " + number);
        return number;
    }

    public String getName() {
        logger.info("Getting order name: " + name);
        return name;
    }
}
