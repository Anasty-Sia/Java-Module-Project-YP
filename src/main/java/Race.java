import java.util.ArrayList;

public class Race {
    int timeRace = 24;
    String winner;
    int winnerSpeed;
    int distance;
    int comparison;

    public void setWinner(ArrayList<Car> carsList, int index) {
        distance = timeRace * carsList.get(index).speed;

        if (index == 0) {
            winner = carsList.get(0).name;
            winnerSpeed = carsList.get(0).speed;
        } else {
            comparison = timeRace * winnerSpeed;
            if (distance > comparison) {
                winner = carsList.get(index).name;
                winnerSpeed = carsList.get(index).speed;
            }
        }
    }

    public void getWinner() {
        System.out.println("Самая быстрая машина: " + winner);
    }
}




