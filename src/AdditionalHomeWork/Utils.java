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
        System.out.println("������� ��������� ��������: ");
        String nameProduct = input.nextLine();
        System.out.println("������� ��������� ��������: ");
        String category = input.nextLine();
        System.out.println("������� ��������� ��������: ");
        double price = input.nextDouble();
        var product = new Product(price, nameProduct, category);
        manager.addProduct(product);
        manager.printProductList();
    }

    static void searchProductInList(ProductManager manager, Scanner input) {
        System.out.println("������� �������� �������� ��������: ");
        String nameProduct = input.nextLine();
        System.out.println("������� ��������� �������� ��������: ");
        String category = input.nextLine();
        Product product = manager.findProduct(nameProduct, category);
        System.out.println((product != null) ? product : "������ �������� �� ����������");
    }

    static void deleteProductFormList(ProductManager manager, Scanner input) {
        System.out.println("������� �������� ���������� ��������: ");
        String nameProduct = input.nextLine();
        System.out.println("������� ��������� ���������� ��������: ");
        String category = input.nextLine();
        int index = manager.deleteProduct(nameProduct, category);
        manager.updateList(index);
        manager.printProductList();

    }

    static void updateProductInList(ProductManager manager, Scanner input) {
        System.out.println("������� �������� ����������� ��������: ");
        String nameProduct = input.nextLine();
        System.out.println("������� ��������� ����������� ��������: ");
        String category = input.nextLine();
        Product product = manager.findProduct(nameProduct, category);
        if (product != null) {
            manager.updateProduct(product, input);
        } else {
            System.out.println("������ ���� ��� ����� ������� �� ������");
        }
    }
}
