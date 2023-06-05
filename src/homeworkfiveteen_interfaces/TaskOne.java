package homeworkfiveteen_interfaces;

public class TaskOne {
    public static void main(String[] args) {

        CoffeeMachine coffeeMachine = new CoffeeMachineImpl(false, 0, 1000, 0,
                500, 0, 500);
        coffeeMachine.makeCoffee("Espresso");

    }
}
