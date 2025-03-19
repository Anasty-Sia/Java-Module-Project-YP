public class Race {
    private static final int TIME_RACE = 24;
    private String winner;
    private int winnerSpeed;
    private int distance;
    private int comparison;

    public void getWinner() {
        System.out.println("Самая быстрая машина: " + winner);
    }

    public void winner(Car cars) {
        distance = TIME_RACE * cars.speed;
        comparison = winnerSpeed * TIME_RACE;
        if (distance > comparison) {
            winnerSpeed = cars.speed;
            winner = cars.name;
        }
    }

}
