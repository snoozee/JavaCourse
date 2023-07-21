package streamapi;

import java.time.Year;
import java.util.Comparator;
import java.util.List;
import java.util.ArrayList;
import java.util.Map;
import java.util.stream.Collectors;

import static streamapi.ProductType.BOOK;

public class ProductShow {
    private static List<Product> products = null;

    public ProductShow() {
        products = new ArrayList<>();
    }

    public void addProduct(Product product) {
        products.add(product);
    }

    public static List<Product> getExpensiveBooks() {
        return products.stream()
                .filter(product -> BOOK.equals(product.getProductType()))
                .filter(product -> product.getPrice() > 250)
                .collect(Collectors.toList());
    }

    public List<Product> getDiscountBooks() {
        return products.stream()
                .filter(product -> BOOK.equals(product.getProductType()))
                .filter(Product::hasDiscount)
                .map(product -> new Product(
                        product.getId(), product.getProductType(), product.getPrice() * 0.9, false, product.getDateAdded())
                )
                .collect(Collectors.toList());
    }

    public Product getCheapestBook() {
        List<Product> books = products.stream()
                .filter(product -> BOOK.equals(product.getProductType()))
                .toList();

        return books.stream()
                .min(Comparator.comparingDouble(Product::getPrice))
                .orElseThrow(() -> new RuntimeException("Product [category: Book] not found"));
    }

    public List<Product> showLastThreeAddedProducts() {
        return products.stream()
                .sorted(Comparator.comparing(Product::getDateAdded).reversed())
                .limit(3)
                .collect(Collectors.toList());
    }

    public double getTotalBooksCostYearPrice() {
        int currentYear = Year.now().getValue();

        return products.stream()
                .filter(product -> BOOK.equals(product.getProductType()))
                .filter(product -> product.getDateAdded().getYear() == currentYear)
                .filter(product -> product.getPrice() <= 75)
                .mapToDouble(Product::getPrice)
                .sum();
    }

    public Map<ProductType, List<Product>> groupProductsByType() {
        return products.stream()
                .collect(Collectors.groupingBy(Product::getProductType));
    }
}
