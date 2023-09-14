package coffee.order;

import java.util.logging.Level;
import java.util.logging.Logger;

public class Order {
    private static final Logger logger = Logger.getLogger(Order.class.getName());

    private int number;
    private String name;

    public Order(int number, String name) {
        this.number = number;
        this.name = name;
        logger.log(Level.INFO, "Order created: " + this.toString());
    }

    public int getNumber() {
        logger.log(Level.INFO, "Order number retrieved: " + this.number);
        return number;
    }

    public String getName() {
        logger.log(Level.INFO, "Order name retrieved: " + this.name);
        return name;
    }

    @Override
    public String toString() {
        return "Order{" +
                "number=" + number +
                ", name='" + name + '\'' +
                '}';
    }
}

