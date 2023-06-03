package homeworkfiveteen;

public interface CoffeeMachine {
    void on();

    void off();

    void cleanCapacity();

    boolean absentWater();

    boolean absentGroundCoffee();

    boolean overflowingCapacity();

    void makeEspresso(double volumeWater, double volumeCoffee);

    void makeAmericano(double volumeWater, double volumeCoffee);
}
