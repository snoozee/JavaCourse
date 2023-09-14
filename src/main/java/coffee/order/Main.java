package coffee.order;

public class Main {
    public static void main(String[] args) {
        CoffeeOrderBoard board = new CoffeeOrderBoard();
        board.addOrder("John");
        board.addOrder("Jane");
        board.addOrder("Bob");
        board.draw();
        board.deliver();
        board.draw();
        board.deliver(3);
        board.deliver(2);
        board.deliver();
        board.deliver(1);
    }
}
