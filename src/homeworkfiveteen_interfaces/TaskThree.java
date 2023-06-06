package homeworkfiveteen_interfaces;

public class TaskThree {
    public static void main(String[] args) {
        CoffeeMachineWithGrainCoffee coffeeMachineWithGrainCoffee = new CoffeeMachineWithGrainCoffeeImpl(false, 0, 1000, 0,
                500, 0, 500, "Candy",
                0, 500, 0, 500);
        ((CoffeeMachineWithGrainCoffeeImpl) coffeeMachineWithGrainCoffee).makeCoffeeAmericanoLatte("Americano");
    }
}
