package coffee.order;

import java.util.ArrayList;
import java.util.List;
import java.util.logging.Logger;

public class CoffeeOrderBoard {
    private static final Logger logger = Logger.getLogger(CoffeeOrderBoard.class.getName());
    private List<Order> orders;
    private int nextOrderNumber;

    public CoffeeOrderBoard() {
        this.orders = new ArrayList<>();
        this.nextOrderNumber = 1;
    }

    public void addOrder(String name) {
        Order order = new Order(nextOrderNumber++, name);
        orders.add(order);

        logger.info("Order added: " + order.getNumber() + " for " + order.getName());
    }

    public void deliver() {
        if (!orders.isEmpty()) {
            Order orderToDeliver = orders.remove(0);
            System.out.println("Order " + orderToDeliver.getNumber() + " for " + orderToDeliver.getName() + " delivered.");

            logger.info("Order added: " + orderToDeliver.getNumber() + " for " + orderToDeliver.getName());
        } else {
            System.out.println("No orders to deliver.");
        }
    }

    public void deliver(int orderNumber) {
        Order orderToDeliver = null;
        for (Order order : orders) {
            if (order.getNumber() == orderNumber) {
                orderToDeliver = order;
                break;
            }
        }

        if (orderToDeliver != null) {
            orders.remove(orderToDeliver);
            System.out.println("Order " + orderToDeliver.getNumber() + " for " + orderToDeliver.getName() + " delivered.");

            logger.info("Order added: " + orderToDeliver.getNumber() + " for " + orderToDeliver.getName());
        } else {
            System.out.println("Order with number " + orderNumber + " not found.");
        }
    }

    public void draw() {
        logger.info("LOGGER:");
        System.out.println("Num | Name");
        for (Order order : orders) {
            System.out.println(order.getNumber() + " | " + order.getName());

            logger.info("Order added: " + order.getNumber() + " for " + order.getName());
        }
    }
}
