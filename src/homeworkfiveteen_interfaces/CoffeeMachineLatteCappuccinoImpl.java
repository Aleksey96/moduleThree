package homeworkfiveteen_interfaces;

import java.util.Scanner;

import static java.lang.System.out;

public class CoffeeMachineLatteCappuccinoImpl extends CoffeeMachineImpl implements CoffeeMachineLatteCappuccino {

    private String brandCoffeeMachine;
    private double currentVolumeMilk;
    private double volumeMilkCapacity;

    CoffeeMachineLatteCappuccinoImpl(boolean on, double volumeWater, double maxVolumeWater, double volumeCoffee,
                                     double maxVolumeCoffee, double workedOutCapacity, double maxVolumeWorkedOutCapacity,
                                     String brandCoffeeMachine, double currentVolumeMilk, double volumeMilkCapacity) {
        super(on, volumeWater, maxVolumeWater, volumeCoffee, maxVolumeCoffee, workedOutCapacity, maxVolumeWorkedOutCapacity);
        this.brandCoffeeMachine = brandCoffeeMachine;
        this.currentVolumeMilk = currentVolumeMilk;
        this.volumeMilkCapacity = volumeMilkCapacity;
    }

    public double getVolumeMilkCapacity() {
        return volumeMilkCapacity;
    }

    public double getCurrentVolumeMilk() {
        return currentVolumeMilk;
    }

    public String getBrandCoffeeMachine() {
        return brandCoffeeMachine;
    }

    public void setVolumeMilkCapacity(double volumeMilkCapacity) {
        this.volumeMilkCapacity = volumeMilkCapacity;
    }

    public void setCurrentVolumeMilk(double currentVolumeMilk) {
        this.currentVolumeMilk = currentVolumeMilk;
    }

    public void setBrandCoffeeMachine(String brandCoffeeMachine) {
        this.brandCoffeeMachine = brandCoffeeMachine;
    }

    @Override
    public boolean isAbsentMilk() {
        if (currentVolumeMilk == 0) {
            out.println("Емкость для молока пуста. Заполните емкость молоком");
            return true;
        } else {
            out.println("Емкость для молока заполнена на " + String.format("2f", currentVolumeMilk / volumeMilkCapacity) + "%");
            return false;
        }
    }

    //в усовии задачи не указана разница между Латте и Капучино
    @Override
    public void makeCappuccinoOrLatte(double volumeMilk) {
        currentVolumeMilk -= volumeMilk;
        super.makeEspresso();
        out.println("Coffee left: " + getVolumeCoffee() + " gr." + " Water left: " + getVolumeWater() + " ml." +
                " Milk left: " + currentVolumeMilk + " ml." + " Used coffee: " + String.format("%.2f", getVolumeWorkedOutCapacity()));
    }

    public void makeFourTypesCoffee(String coffeeName) {
        on();
        checkWaterAndCoffee();
        if (isAbsentMilk()) {
            currentVolumeMilk = volumeMilkCapacity;
        }
        cleanCapacity();
        makeCoffee(coffeeName);
        if (!coffeeName.equalsIgnoreCase("espresso") && !coffeeName.equalsIgnoreCase("americano")) {
            var scanner = new Scanner(System.in);
            out.println("Введите количество молока, которое хотите добавиить.");
            var volumeMilk = scanner.nextDouble();
            makeCappuccinoOrLatte(volumeMilk);
        }
        off();
    }
}
