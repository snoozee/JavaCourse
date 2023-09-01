package streamapi;

public enum ProductType {
    BOOK("Book"),
    NEWSPAPER("Newspaper"),
    MAGAZINE("Magazine");

    ProductType(String name) {this.name = name;}

    private final String name;

    @Override
    public String toString() {return name;}
}