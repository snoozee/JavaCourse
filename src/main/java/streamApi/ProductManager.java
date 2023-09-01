package streamApi;

import java.util.List;
import java.util.stream.Collectors;

public class ProductManager {
    private List<Product> products;

    // Initialize products list
    public ProductManager(List<Product> products) {
        this.products = products;
    }

    // Get products "Book" and price > 250
    public List<Product> getBooks() {
        return products.stream()
                .filter(product -> "Book".equals(product.getType()) && product.getPrice() > 250)
                .collect(Collectors.toList());
    }

    // Get 10% discount
    public List<Product> getDiscountBooks() {
        return products.stream()
                .filter(product -> "Book".equals(product.getType()) && product.isDiscount())
                .map(product -> new Product(product.getType(), product.getPrice() * 0.9, product.isDiscount()))
                .collect(Collectors.toList());
    }
}
