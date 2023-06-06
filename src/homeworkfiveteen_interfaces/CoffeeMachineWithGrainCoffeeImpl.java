package homeworkfiveteen_interfaces;

import java.util.Scanner;

import static java.lang.System.out;

public class CoffeeMachineWithGrainCoffeeImpl extends CoffeeMachineLatteCappuccinoImpl implements CoffeeMachineWithGrainCoffee {

    private double currentVolumeGrainCoffee;
    private double volumeGrainCoffeeCapacity;

    CoffeeMachineWithGrainCoffeeImpl(boolean on, double volumeWater, double maxVolumeWater, double volumeCoffee,
                                     double maxVolumeCoffee, double workedOutCapacity, double maxVolumeWorkedOutCapacity,
                                     String brandCoffeeMachine, double currentVolumeMilk, double volumeMilkCapacity,
                                     double currentVolumeGrainCoffee, double volumeGrainCoffeeCapacity) {
        super(on, volumeWater, maxVolumeWater, volumeCoffee, maxVolumeCoffee, workedOutCapacity, maxVolumeWorkedOutCapacity,
                brandCoffeeMachine, currentVolumeMilk, volumeMilkCapacity);
        this.currentVolumeGrainCoffee = currentVolumeGrainCoffee;
        this.volumeGrainCoffeeCapacity = volumeGrainCoffeeCapacity;
    }

    public double getVolumeGrainCoffeeCapacity() {
        return volumeGrainCoffeeCapacity;
    }

    public double getCurrentVolumeGrainCoffee() {
        return currentVolumeGrainCoffee;
    }

    public void setCurrentVolumeGrainCoffee(double currentVolumeGrainCoffee) {
        this.currentVolumeGrainCoffee = currentVolumeGrainCoffee;
    }

    public void setVolumeGrainCoffeeCapacity(double volumeGrainCoffeeCapacity) {
        this.volumeGrainCoffeeCapacity = volumeGrainCoffeeCapacity;
    }

    @Override
    public boolean isAbsentGrainCoffee() {
        if (currentVolumeGrainCoffee == 0) {
            out.println("Емкость для зернового кофе пуста. Заполните емкость зерновым кофе");
            return true;
        } else {
            out.println("Емкость для зернового кофе заполнена на " + String.format("2f", currentVolumeGrainCoffee / volumeGrainCoffeeCapacity) + "%");
            return false;
        }
    }

    public void grindCoffee() {
        var scanner = new Scanner(System.in);
        out.println("Введите количество зернового кофе, который хотите перемолоть.");
        var volumeCoffee = scanner.nextDouble();
        setVolumeCoffee(volumeCoffee);
        currentVolumeGrainCoffee -= volumeCoffee;
    }

    @Override
    public void makeCoffeeAmericanoLatte(String coffeeName) {
        on();
        checkWaterAndCoffee();
        if (isAbsentMilk()) {
            setCurrentVolumeMilk(getVolumeMilkCapacity());
        }
        if (isAbsentGrainCoffee()) {
            currentVolumeGrainCoffee = volumeGrainCoffeeCapacity;
        }
        cleanCapacity();
        grindCoffee();
        var scanner = new Scanner(System.in);
        out.println("Введите количество молока, которое хотите добавить.");
        var volumeMilk = scanner.nextDouble();
        switch (coffeeName.toLowerCase()) {
            case "latte": {
                makeCappuccinoOrLatte(volumeMilk);
                out.println("Espresso is ready");
                out.println("Grain coffee left: " + currentVolumeGrainCoffee + " gr." + " Water left: " + getVolumeWater() + " ml." + " Used coffee: " + String.format("%.2f", getVolumeWorkedOutCapacity()));
                break;
            }
            case "americano": {
                makeAmericano();
                out.println("Americano is ready");
                out.println("Grain coffee left: " + currentVolumeGrainCoffee + " gr." + " Water left: " + getVolumeWater() + " ml." + " Used coffee: " + String.format("%.2f", getVolumeWorkedOutCapacity()));
                break;
            }
        }
        off();
    }

}
