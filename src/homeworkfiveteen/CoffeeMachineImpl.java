package homeworkfiveteen;

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

    @Override
    public boolean absentWater() {
        if (volumeWater == 0) {
            out.println("В кофемашиине отсутствует вода");
            return false;
        } else {
            out.println("В кофемашиине налита вода");
            return true;
        }
    }

    @Override
    public boolean absentGroundCoffee() {
        if (volumeCoffee == 0) {
            out.println("В кофемашиине отсутствует кофе");
            return false;
        } else {
            out.println("В кофемашиине насыпан кофе");
            return true;
        }
    }

    @Override
    public boolean overflowingCapacity() {
        if (volumeWorkedOutCapacity >= maxVolumeWorkedOutCapacity) {
            out.println("Емкость отработанного кофе переполнена. Очистите емкость!");
            return true;
        } else {
            out.println("Емкость отработанного кофе заполнена на " + volumeWorkedOutCapacity / maxVolumeWorkedOutCapacity * 100 + "%");
            return false;
        }
    }

    @Override
    public void on() {
        if (on) {
            out.println("Кофемашина уже включена.");
        } else {
            on = true;
            out.println("Кофемашина включена.");
        }
    }

    @Override
    public void off() {
        if (!on) {
            out.println("Кофемашина уже выключена.");
        } else {
            on = false;
            out.println("Кофемашина включена.");
        }
    }

    @Override
    public void cleanCapacity() {
        if (overflowingCapacity()) {
            volumeWorkedOutCapacity = 0;
            out.println("Емкость отработанного кофе очищена. Заполненность емкости " + volumeWorkedOutCapacity / maxVolumeWorkedOutCapacity * 100 + "%");
        } else {
            out.println("Емкость отработанного кофе не заполнена. Заполненность емкости " + volumeWorkedOutCapacity / maxVolumeWorkedOutCapacity * 100 + "%");
        }
        //дать пользователю при желании очистить емкость
    }

    @Override
    public void makeEspresso(double volumeWater, double volumeCoffee) {
        //как будем готовить эспрессо?
    }

    @Override
    public void makeAmericano(double volumeWater, double volumeCoffee) {
        //как будем готовить американо?
    }


}
