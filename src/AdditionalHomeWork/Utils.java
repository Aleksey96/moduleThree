package AdditionalHomeWork;

import java.util.Scanner;

public class Utils {

    static void printProductList(ProductManager manager) {
        manager.printProductList();
    }

    static void sortProductList(ProductManager manager) {
        manager.sortProducts();
        manager.printProductList();
    }

    static void addProductToList(ProductManager manager) {
        var input = new Scanner(System.in);
        System.out.println("¬ведите названние продукта: ");
        String nameProduct = input.nextLine();
        System.out.println("¬ведите категорию продукта: ");
        String category = input.nextLine();
        System.out.println("¬ведите стоимость продукта: ");
        double price = input.nextDouble();
        var product = new Product(price, nameProduct, category);
        manager.addProduct(product);
        manager.printProductList();
    }

    static void searchProductInList(ProductManager manager, Scanner input) {
        System.out.println("¬ведите название искомого продукта: ");
        String nameProduct = input.nextLine();
        System.out.println("¬ведите категорию искомого продукта: ");
        String category = input.nextLine();
        Product product = manager.findProduct(nameProduct, category);
        System.out.println((product != null) ? product : "“акого продукта не существует");
    }

    static void deleteProductFormList(ProductManager manager, Scanner input) {
        System.out.println("¬ведите название удал€емого продукта: ");
        String nameProduct = input.nextLine();
        System.out.println("¬ведите категорию удал€емого продукта: ");
        String category = input.nextLine();
        int index = manager.deleteProduct(nameProduct, category);
        manager.updateList(index);
        manager.printProductList();

    }

    static void updateProductInList(ProductManager manager, Scanner input) {
        System.out.println("¬ведите название измен€емого продукта: ");
        String nameProduct = input.nextLine();
        System.out.println("¬ведите категорию измен€емого продукта: ");
        String category = input.nextLine();
        Product product = manager.findProduct(nameProduct, category);
        if (product != null) {
            manager.updateProduct(product, input);
        } else {
            System.out.println("—писок пуст или такой продукт не найден");
        }
    }
}
