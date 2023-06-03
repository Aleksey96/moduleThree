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
            out.println("� ����������� ����������� ����");
            return false;
        } else {
            out.println("� ����������� ������ ����");
            return true;
        }
    }

    @Override
    public boolean absentGroundCoffee() {
        if (volumeCoffee == 0) {
            out.println("� ����������� ����������� ����");
            return false;
        } else {
            out.println("� ����������� ������� ����");
            return true;
        }
    }

    @Override
    public boolean overflowingCapacity() {
        if (volumeWorkedOutCapacity >= maxVolumeWorkedOutCapacity) {
            out.println("������� ������������� ���� �����������. �������� �������!");
            return true;
        } else {
            out.println("������� ������������� ���� ��������� �� " + volumeWorkedOutCapacity / maxVolumeWorkedOutCapacity * 100 + "%");
            return false;
        }
    }

    @Override
    public void on() {
        if (on) {
            out.println("���������� ��� ��������.");
        } else {
            on = true;
            out.println("���������� ��������.");
        }
    }

    @Override
    public void off() {
        if (!on) {
            out.println("���������� ��� ���������.");
        } else {
            on = false;
            out.println("���������� ��������.");
        }
    }

    @Override
    public void cleanCapacity() {
        if (overflowingCapacity()) {
            volumeWorkedOutCapacity = 0;
            out.println("������� ������������� ���� �������. ������������� ������� " + volumeWorkedOutCapacity / maxVolumeWorkedOutCapacity * 100 + "%");
        } else {
            out.println("������� ������������� ���� �� ���������. ������������� ������� " + volumeWorkedOutCapacity / maxVolumeWorkedOutCapacity * 100 + "%");
        }
        //���� ������������ ��� ������� �������� �������
    }

    @Override
    public void makeEspresso(double volumeWater, double volumeCoffee) {
        //��� ����� �������� ��������?
    }

    @Override
    public void makeAmericano(double volumeWater, double volumeCoffee) {
        //��� ����� �������� ���������?
    }


}
