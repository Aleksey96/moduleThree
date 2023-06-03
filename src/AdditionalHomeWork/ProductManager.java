package AdditionalHomeWork;

import java.util.Scanner;

public class ProductManager {

    private Product[] products = new Product[10];

    public static String greetUsers(Scanner scanner) {
        System.out.println("Выберите действие: " +
                "\n1. Продолжить..." +
                "\n2. Выйти.");
        return scanner.nextLine();
    }

    public void printProductList() {
        for (int i = 0; i < products.length; i++) {
            if (products[i] != null) {
                System.out.println(products[i]);
            }
        }
    }

    public void addProduct(Product product) {
        for (int i = 0; i < products.length; i++) {
            if (products[i] == null) {
                products[i] = product;
                break;
            }
        }
    }

    public void updateList(int index) {
        if (index == -1) {
            return;
        }
        for (int i = index; i < products.length-1; i++) {
            products[i] = products[i + 1];
        }
    }

    public void sortProducts() {
        if (products[0] == null) {
            return;
        }
        for (int i = 0; i < products.length - 1; i++) {
            for (int j = i + 1; j < products.length; j++) {
                if (products[j] == null) {
                    break;
                }
                if (products[i].compareTo(products[j]) > 0) {
                    Product temp = products[j];
                    products[j] = products[i];
                    products[i] = temp;
                }
            }
        }
    }

    // подумать, о том чтобы игннорировать ригистр строк
    public Product findProduct(String nameProduct, String category) {
        int index = -1;
        for (int i = 0; i < products.length; i++) {
            if (products[i] != null && products[i].getNameProduct().equalsIgnoreCase(nameProduct) &&
                    products[i].getCategory().equalsIgnoreCase(category)) {
                index = i;
            }
        }
        if (index != -1) {
            return products[index];
        } else {
            return null;
        }
    }
    public int deleteProduct(String nameProduct, String category) {
        int index = -1;
        for (int i = 0; i < products.length; i++) {
            if (products[i] == null) {
                System.out.println("Такого продукта нет или список пуст");
                break;
            }
            if (products[i].getNameProduct().equalsIgnoreCase(nameProduct)
                    && products[i].getCategory().equalsIgnoreCase(category)) {
                index = i;
                break;
            }
        }
        for (int i = 0; i < products.length; i++) {
            if (index == -1) {
                break;
            }
            if (i == index) {
                products[i] = null;
                break;
            }
        }
        return index;
    }

    public void updateProduct(Product product, Scanner scanner) {
        System.out.println("1 - Изменить название продукта\n" +
                "2 - Изменить категорию продукта\n" +
                "3 - Измениить стоимость продукта");
        switch (scanner.nextLine()) {
            case "1" -> {
                System.out.println("Введите новое название продукта");
                product.setNameProduct(scanner.nextLine());
                break;
            }
            case "2" -> {
                System.out.println("Введите новую категориию продукта");
                product.setCategory(scanner.nextLine());
                break;
            }
            case "3" -> {
                System.out.println("Введите новую стоимость продукта");
                product.setPrice(scanner.nextDouble());
                break;
            }
            default -> {
                System.out.println("Такого действия не предусмотрено");
            }
        }

    }

    public static void chooseAction(ProductManager manager, Scanner scanner) {
        System.out.println("Выберите действие: " +
                "\n1. Добавить продукт." +
                "\n2. Удалить продукт." +
                "\n3. Отсортировать список продуктов." +
                "\n4. Напечать список продуктов" +
                "\n5. Изменить продукт" +
                "\n6. Найти продукт");

        switch (scanner.nextLine()) {
            case "1" -> Utils.addProductToList(manager);
            case "2" -> Utils.deleteProductFormList(manager, scanner);
            case "3" -> Utils.sortProductList(manager);
            case "4" -> Utils.printProductList(manager);
            case "5" -> Utils.updateProductInList(manager, scanner);
            case "6" -> Utils.searchProductInList(manager, scanner);
            default -> System.out.println("Такого действие не предусмотрено");
        }
    }
}
