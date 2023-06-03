package oop.privatescope;

public class Parent {
    int i;
    private int j;

    int getJ() {
        return j;
    }

    void setIJ(int _i, int _j) {
        i = _i;
        j = _j;
    }

    void display() {
        System.out.println(i + "" + j);
    }
}
