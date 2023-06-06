package homeworkfiveteen_interfaces;

public interface CoffeeMachine {
    void on();

    void off();

    void makeEspresso();

    void cleanCapacity();

    void makeAmericano();

    boolean absentWater();

    boolean absentGroundCoffee();

    boolean overflowingCapacity();
}
