package homeworkfiveteen_interfaces;

public class TaskTwo {
    public static void main(String[] args) {

        CoffeeMachineLatteCappuccino coffeeMachineLatteCappuccino = new CoffeeMachineLatteCappuccinoImpl(false, 0, 1000, 0,
                500, 0, 500, "Candy",
                0, 500);
        ((CoffeeMachineLatteCappuccinoImpl) coffeeMachineLatteCappuccino).makeFourTypesCoffee("Cappuccino");


    }
}
