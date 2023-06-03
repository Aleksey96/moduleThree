package moduletwo;

public class TaskThree {
    /*
    S=PI*D*D/4
    L=PI*D
    L-?
    D-?
     */
    public static void main(String[] args) {
        final double PI = 3.14;
        double squareCircle = 5.647;
        System.out.println("Диаметр окружности равен " + (2 * Math.sqrt(squareCircle / PI)));
        System.out.println("Длина окружности равна " + (2 * Math.sqrt(PI * squareCircle)));


    }
}
