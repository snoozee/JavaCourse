package streamapi;

import java.time.LocalDate;

public class Product {
    private final int id;
    private final ProductType productType;
    private final double price;
    private final boolean discount;
    private final LocalDate dateAdded;

    public Product (int id, ProductType productType, double price, boolean discount, LocalDate dateAdded) {
        this.id = id;
        this.productType = productType;
        this.price = price;
        this.discount = discount;
        this.dateAdded = dateAdded;
    }

    public ProductType getProductType() {
        return productType;
    }

    public int getId() {
        return id;
    }

    public double getPrice() {
        return price;
    }

    public boolean hasDiscount() {
        return discount;
    }

    public LocalDate getDateAdded() {
        return dateAdded;
    }

    @Override
    public String toString() {
        return "\nProduct{" +
                "id=" + id +
                ", type='" + getProductType() + '\'' +
                ", price=" + price +
                ", hasDiscount=" + discount +
                ", addedDate=" + dateAdded +
                '}';
    }
}
