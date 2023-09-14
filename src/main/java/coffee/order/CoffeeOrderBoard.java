package coffee.order;

import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
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
        logger.log(Level.INFO, "Order added: " + order.toString());
    }

    public void deliver() {
        if (!orders.isEmpty()) {
            Order orderToDeliver = orders.remove(0);
            System.out.println("Order " + orderToDeliver.getNumber() + " for " + orderToDeliver.getName() + " delivered.");
            logger.log(Level.INFO, "Order delivered: " + orderToDeliver.toString());
        } else {
            System.out.println("No orders to deliver.");
            logger.log(Level.INFO, "No orders to deliver.");
        }
    }

    public void deliver(int orderNumber) {
        Order orderToDeliver = findOrder(orderNumber);
        if (orderToDeliver != null) {
            orders.remove(orderToDeliver);
            System.out.println("Order " + orderToDeliver.getNumber() + " for " + orderToDeliver.getName() + " delivered.");
            logger.log(Level.INFO, "Order delivered: " + orderToDeliver.toString());
        } else {
            System.out.println("Order with number " + orderNumber + " not found.");
            logger.log(Level.INFO, "Order with number " + orderNumber + " not found.");
        }
    }

    public void draw() {
        System.out.println("Current orders:");
        for (Order order : orders) {
            System.out.println(order.toString());
        }
    }

    private Order findOrder(int orderNumber) {
        for (Order order : orders) {
            if (order.getNumber() == orderNumber) {
                return order;
            }
        }
        return null;
    }

    public List<Order> getOrders() {
        return new ArrayList<>(orders);
    }
}

