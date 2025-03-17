import java.util.ArrayList;
import java.util.Scanner;

public static void main(String[] args) {

    ArrayList<Car> carsList = new ArrayList<>();
    Race races = new Race();
    String name;
    int speed;
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
                if (0 < speed && speed <= 250) {
                    carsList.add(new Car(name, speed));
                    races.setWinner(carsList, i);
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
