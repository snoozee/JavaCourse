package order;

import coffee.order.CoffeeOrderBoard;
import coffee.order.Order;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.verify;

public class CoffeeOrderBoardTest {

    private CoffeeOrderBoard coffeeOrderBoard;
    private Logger mockLogger;

    public CoffeeOrderBoardTest(Logger mockLogger) {
        this.mockLogger = mockLogger;
    }

    @BeforeEach
    public void setUp() {
        coffeeOrderBoard = new CoffeeOrderBoard();
    }

    @Test
    public void testAddOrder() {
        coffeeOrderBoard.addOrder("John Doe");
        List<Order> orders = coffeeOrderBoard.getOrders();
        assertEquals(1, orders.size());
        assertEquals(1, orders.get(0).getNumber());
        assertEquals("John Doe", orders.get(0).getName());
        verify(mockLogger).log(Level.INFO, "Order added: " + orders.get(0).toString());
    }

    @Test
    public void testDeliver() {
        coffeeOrderBoard.addOrder("Jane");
        coffeeOrderBoard.deliver();
        assertTrue(coffeeOrderBoard.getOrders().isEmpty());
        verify(mockLogger).log(Level.INFO, "Order delivered: " + new Order(1, "Jane").toString());
    }

    @Test
    public void testDeliverWithOrderNumber() {
        coffeeOrderBoard.addOrder("Jane");
        coffeeOrderBoard.addOrder("John");
        coffeeOrderBoard.deliver(2);
        List<Order> orders = coffeeOrderBoard.getOrders();
        assertEquals(1, orders.size());
        assertEquals(1, orders.get(0).getNumber());
        assertEquals("John", orders.get(0).getName());
        verify(mockLogger).log(Level.INFO, "Order delivered: " + new Order(2, "John").toString());
    }

    @Test
    public void testDraw() {
        coffeeOrderBoard.addOrder("Jane Smith");
        coffeeOrderBoard.addOrder("John Doe");
        coffeeOrderBoard.draw();
        verify(mockLogger).log(Level.INFO, "Current state of the queue: [Order{number=2, name='John Doe'}, Order{number=1, name='Jane Smith'}]");
    }
}
