package homeworkfiveteen_interfaces;

import static java.lang.System.out;

public class CoffeeMachineImpl implements CoffeeMachine {
    private boolean on;
    private double volumeWater;
    private double volumeCoffee;
    private double maxVolumeWater;
    private double maxVolumeCoffee;
    private double volumeWorkedOutCapacity;
    private double maxVolumeWorkedOutCapacity;

    CoffeeMachineImpl(boolean on, double volumeWater, double maxVolumeWater, double volumeCoffee,
                      double maxVolumeCoffee, double workedOutCapacity, double maxVolumeWorkedOutCapacity) {
        this.on = on;
        this.volumeWater = volumeWater;
        this.volumeCoffee = volumeCoffee;
        this.maxVolumeWater = maxVolumeWater;
        this.maxVolumeCoffee = maxVolumeCoffee;
        this.volumeWorkedOutCapacity = workedOutCapacity;
        this.maxVolumeWorkedOutCapacity = maxVolumeWorkedOutCapacity;
    }

    public boolean isOn() {
        return on;
    }

    public double getVolumeWater() {
        return volumeWater;
    }

    public double getVolumeCoffee() {
        return volumeCoffee;
    }

    public double getMaxVolumeWater() {
        return maxVolumeWater;
    }

    public double getMaxVolumeCoffee() {
        return maxVolumeCoffee;
    }

    public double getVolumeWorkedOutCapacity() {
        return volumeWorkedOutCapacity;
    }

    public double getMaxVolumeWorkedOutCapacity() {
        return maxVolumeWorkedOutCapacity;
    }

    public void setOn(boolean on) {
        this.on = on;
    }

    public void setVolumeWater(double volumeWater) {
        this.volumeWater = volumeWater;
    }

    public void setVolumeCoffee(double volumeCoffee) {
        this.volumeCoffee = volumeCoffee;
    }

    public void setMaxVolumeWater(double maxVolumeWater) {
        this.maxVolumeWater = maxVolumeWater;
    }

    public void setMaxVolumeCoffee(double maxVolumeCoffee) {
        this.maxVolumeCoffee = maxVolumeCoffee;
    }

    public void setVolumeWorkedOutCapacity(double workedOutCapacity) {
        this.volumeWorkedOutCapacity = workedOutCapacity;
    }

    public void setMaxVolumeWorkedOutCapacity(double maxVolumeWorkedOutCapacity) {
        this.maxVolumeWorkedOutCapacity = maxVolumeWorkedOutCapacity;
    }

    protected void checkWaterAndCoffee() {
        if (!absentWater()) {
            volumeWater = maxVolumeWater;
            out.println("The coffee machine is filled ground water " + volumeWater + " ml");
        }
        if (!absentGroundCoffee()) {
            volumeCoffee = maxVolumeCoffee;
            out.println("The coffee machine is filled with used coffee " + volumeCoffee + " gr");
        }
    }

    @Override
    public boolean absentWater() {
        if (volumeWater == 0) {
            out.println("There is no water in the coffee machine");
            return false;
        } else {
            out.println("There is water in the coffee machine");
            return true;
        }
    }

    @Override
    public boolean absentGroundCoffee() {
        if (volumeCoffee == 0) {
            out.println("There is no coffee in the coffee machine");
            return false;
        } else {
            out.println("Coffee is poured in the coffee machine");
            return true;
        }
    }

    @Override
    public boolean overflowingCapacity() {
        if (volumeWorkedOutCapacity >= maxVolumeWorkedOutCapacity) {
            out.println("The spent coffee tank is overflowing. Clean the container!");
            return true;
        } else {
            out.println("The spent coffee tank is filled with " + volumeWorkedOutCapacity / maxVolumeWorkedOutCapacity * 100 + "%");
            return false;
        }
    }

    @Override
    public void on() {
        if (on) {
            out.println("The coffee machine is already on.");
        } else {
            on = true;
            out.println("The coffee machine is on.");
        }
    }

    @Override
    public void off() {
        if (!on) {
            out.println("The coffee machine is already turned off.");
        } else {
            on = false;
            out.println("The coffee machine is off.");
        }
    }

    @Override
    public void cleanCapacity() {
        if (overflowingCapacity()) {
            volumeWorkedOutCapacity = 0;
            out.println("The spent coffee tank has been cleaned. Capacity fullness 0%");
        }
    }

    @Override
    public void makeEspresso() {
        volumeCoffee -= 22;
        volumeWater -= 30;
        volumeWorkedOutCapacity += 0.2 * 22;
    }

    @Override
    public void makeAmericano() {
        volumeCoffee -= 22;
        volumeWater -= 100;
        volumeWorkedOutCapacity += 0.2 * 22;
    }


    public void makeCoffee(String coffee) {
        switch (coffee.toLowerCase()) {
            case "espresso": {
                makeEspresso();
                out.println("Espresso is ready");
                out.println("Coffee left: " + volumeCoffee + " gr." + " Water left: " + volumeWater + " ml." + " Used coffee: " + String.format("%.2f", volumeWorkedOutCapacity));
                break;
            }
            case "americano": {
                makeAmericano();
                out.println("Americano is ready");
                out.println("Coffee left: " + volumeCoffee + " gr." + " Water left: " + volumeWater + " ml." + " Used coffee: " + String.format("%.2f", volumeWorkedOutCapacity));
                break;
            }
        }
    }
}
