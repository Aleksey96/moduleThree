package moduletwo;

public class TaskOne {
    public static void main(String[] args) {
        Pet pet = new Pet();
        pet.weight = 4.67;
        pet.name = "Серый";
        pet.type = "гусь";
        System.out.println("Домашнее животное: " + pet.type + ", " +
                "Кличка: " + pet.name + ", " +
                "Вес: " + pet.weight + " кг");

    }
}
