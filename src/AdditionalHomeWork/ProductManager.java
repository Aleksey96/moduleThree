package AdditionalHomeWork;

import java.util.Scanner;

public class ProductManager {

    private Product[] products = new Product[10];

    public static String greetUsers(Scanner scanner) {
        System.out.println("�������� ��������: " +
                "\n1. ����������..." +
                "\n2. �����.");
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

    // ��������, � ��� ����� ������������� ������� �����
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
                System.out.println("������ �������� ��� ��� ������ ����");
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
        System.out.println("1 - �������� �������� ��������\n" +
                "2 - �������� ��������� ��������\n" +
                "3 - ��������� ��������� ��������");
        switch (scanner.nextLine()) {
            case "1" -> {
                System.out.println("������� ����� �������� ��������");
                product.setNameProduct(scanner.nextLine());
                break;
            }
            case "2" -> {
                System.out.println("������� ����� ���������� ��������");
                product.setCategory(scanner.nextLine());
                break;
            }
            case "3" -> {
                System.out.println("������� ����� ��������� ��������");
                product.setPrice(scanner.nextDouble());
                break;
            }
            default -> {
                System.out.println("������ �������� �� �������������");
            }
        }

    }

    public static void chooseAction(ProductManager manager, Scanner scanner) {
        System.out.println("�������� ��������: " +
                "\n1. �������� �������." +
                "\n2. ������� �������." +
                "\n3. ������������� ������ ���������." +
                "\n4. �������� ������ ���������" +
                "\n5. �������� �������" +
                "\n6. ����� �������");

        switch (scanner.nextLine()) {
            case "1" -> Utils.addProductToList(manager);
            case "2" -> Utils.deleteProductFormList(manager, scanner);
            case "3" -> Utils.sortProductList(manager);
            case "4" -> Utils.printProductList(manager);
            case "5" -> Utils.updateProductInList(manager, scanner);
            case "6" -> Utils.searchProductInList(manager, scanner);
            default -> System.out.println("������ �������� �� �������������");
        }
    }
}
