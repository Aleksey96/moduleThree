package homeworksixteen_exceptions;

public final class Triangle {
    private final double sideA;
    private final double sideB;
    private final double sideC;

    Triangle(double sideA, double sideB, double sideC) {
        this.sideA = sideA;
        this.sideB = sideB;
        this.sideC = sideC;
        if (!(sideA + sideB > sideC && sideA + sideC > sideB && sideB + sideC > sideA)) {
            throw new RuntimeException("Такого треугольника не существует");
        }
    }

    public double getSideC() {
        return sideC;
    }

    public double getSideB() {
        return sideB;
    }

    public double getSideA() {
        return sideA;
    }
}
