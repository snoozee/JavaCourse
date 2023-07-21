package streamapi;

import java.time.LocalDate;
import java.util.List;
import java.util.Map;

public class Main {
    public static void main(String[] args) {
        // Products sample
        Product product1 = new Product( 1, ProductType.BOOK, 300, false, LocalDate.of(2023, 3, 3));
        Product product2 = new Product(2, ProductType.MAGAZINE, 150, false, LocalDate.of(2023, 2, 12));
        Product product3 = new Product(3, ProductType.NEWSPAPER, 30, false, LocalDate.of(2023, 12, 12));
        Product product4 = new Product(4, ProductType.BOOK, 180, true, LocalDate.of(2022, 12, 12));
        Product product5 = new Product(5, ProductType.MAGAZINE, 50, false, LocalDate.of(2023, 7, 20));
        Product product6 = new Product(6, ProductType.BOOK, 225.0, false, LocalDate.of(2023, 1, 12));
        Product product7 = new Product(7, ProductType.MAGAZINE, 30, false, LocalDate.of(2023, 7, 12));
        Product product8 = new Product(8, ProductType.BOOK, 300, true, LocalDate.of(2023, 5, 7));
        Product product9 = new Product(9, ProductType.BOOK, 100, false, LocalDate.of(2023, 4, 30));
        Product product10 = new Product(10, ProductType.MAGAZINE, 12, false, LocalDate.of(2023, 12, 12));
        
        // Create Product Show and add products
        ProductShow productShow = new ProductShow();
        productShow.addProduct(product1);
        productShow.addProduct(product2);
        productShow.addProduct(product3);
        productShow.addProduct(product4);
        productShow.addProduct(product5);
        productShow.addProduct(product6);
        productShow.addProduct(product7);
        productShow.addProduct(product8);
        productShow.addProduct(product9);
        productShow.addProduct(product10);

        // Get Expensive Books
        List<Product> expensiveBooks = ProductShow.getExpensiveBooks();
        System.out.println("Expensive books:");
        for (Product product : expensiveBooks) {
            System.out.println(product.getId() + ": " + product.getProductType() + " - $" + product.getPrice());
        }

        // Get discounted books
        List<Product> discountedBooks = productShow.getDiscountBooks();
        System.out.println("\nDiscounted Books:");
        for (Product product : discountedBooks) {
            System.out.println(product.getId() + ": " + product.getProductType() + " - $" + product.getPrice());
        }

        // Get the cheapest book
        try {
            Product cheapestBook = productShow.getCheapestBook();
            System.out.println("\nCheapest Book: " + cheapestBook.getProductType() + " - $" + cheapestBook.getPrice());
        } catch (RuntimeException e) {
            System.out.println(e.getMessage());
        }

        // Get the last three added products.
        List<Product> lastThreeAddedProducts = productShow.showLastThreeAddedProducts();
        System.out.println("\nLast three added products: " + lastThreeAddedProducts);

        // Get the total cost of books that meet the criteria for the current year.
        double totalCostOfBooks = productShow.getTotalBooksCostYearPrice();
        System.out.println("Total cost of books for the current year: " + totalCostOfBooks);

        // Group products by type.
        Map<ProductType, List<Product>> productsByType = productShow.groupProductsByType();
        System.out.println("\nProducts grouped by type:");
        for (ProductType type : productsByType.keySet()) {
            List<Product> productList = productsByType.get(type);
            System.out.println(type + ": " + productList);
        }
    }
}
