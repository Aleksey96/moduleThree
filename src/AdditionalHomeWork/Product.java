package AdditionalHomeWork;

public class Product implements Comparable<Product> {
    private double price;
    private String nameProduct;
    private String category;

    Product(double price, String nameProduct, String category) {
        this.price = price;
        this.nameProduct = nameProduct;
        this.category = category;
    }

    public double getPrice() {
        return price;
    }

    public String getNameProduct() {
        return nameProduct;
    }

    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category;
    }

    public void setNameProduct(String nameProduct) {
        this.nameProduct = nameProduct;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    @Override
    public String toString() {
        return "Product{ " + this.nameProduct +
                ", " + this.category + ", " +
                this.price + " }";
    }

    @Override
    public int compareTo(Product anotherProduct) {
        int result = this.category.compareTo(anotherProduct.category);
        if (result == 0) {
            result = this.nameProduct.compareTo(anotherProduct.nameProduct);
        }
        return result;
    }
}
