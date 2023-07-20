package streamapi;

import java.time.LocalDate;

public class Product {
    private final int ID;
    private final ProductType productType;
    private final double price;
    private final boolean discount;
    private final LocalDate dateAdded;

    public Product (int ID, ProductType productType, double price, boolean discount, LocalDate dateAdded) {
        this.ID = ID;
        this.productType = productType;
        this.price = price;
        this.discount = discount;
        this.dateAdded = dateAdded;
    }

    public ProductType getProductType() {
        return productType;
    }

    public int getID() {
        return ID;
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
                "id=" + ID +
                ", type='" + getProductType() + '\'' +
                ", price=" + price +
                ", hasDiscount=" + discount +
                ", addedDate=" + dateAdded +
                '}';
    }
}
