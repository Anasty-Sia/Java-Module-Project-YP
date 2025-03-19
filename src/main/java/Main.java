import java.util.Scanner;

public static void main(String[] args) {

    Race races = new Race();
    String name;
    int speed;
    final int minSpeed = 0;
    final int maxSpeed = 250;
    Scanner scanner = new Scanner(System.in);

    for (int i = 0; i <= 2; i++) {
        int j = i + 1;
        System.out.println("Введите название " + j + " машины:");
        name = scanner.next();
        if (name.isEmpty()) {
            System.out.println("Название автомобиля не может быть пустым");
        }
        System.out.println("Введите скорость " + j + " машины:");

        while (true) {
            if (scanner.hasNextInt()) {

                speed = scanner.nextInt();
                if (minSpeed < speed && speed <= maxSpeed) {
                    Car cars = new Car(name, speed);
                    races.winner(cars);
                    break;
                } else {
                    System.out.println("Введите другую скорость машины от 0 до 250.");
                }
            } else {
                System.out.println("Введите целое число.");
                scanner.next();
            }
        }

    }
    races.getWinner();
}
