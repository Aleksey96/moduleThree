package homeworkfiveteen_interfaces;

public interface CoffeeMachine {
    void on();

    void off();

    void cleanCapacity();

    boolean absentWater();

    boolean absentGroundCoffee();

    boolean overflowingCapacity();

    void makeCoffee(String coffeeName);
}
