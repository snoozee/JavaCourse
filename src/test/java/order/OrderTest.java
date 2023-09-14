package order;

import coffee.order.Order;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.logging.Level;
import java.util.logging.Logger;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.Mockito.verify;

public class OrderTest {
    private Order order;
    private Logger mockLogger;

    public OrderTest(Logger mockLogger) {
        this.mockLogger = mockLogger;
    }

    @BeforeEach
    public void setUp() {
        order = new Order(1, "John");
    }

    @Test
    public void testGetNumber() {
        assertEquals(1, order.getNumber());
        verify(mockLogger).log(Level.INFO, "Order number retrieved: 1");
    }

    @Test
    public void testGetName() {
        assertEquals("John", order.getName());
        verify(mockLogger).log(Level.INFO, "Order name retrieved: John");
    }
}
