package collections;
import java.util.LinkedList;
import java.util.Queue;

public class HotPotatoGame {
	public static void main(String[] args) {
		Queue<String> players = new LinkedList<>();
        players.add("Bhavana");
        players.add("Sita");
        players.add("Rama");
        players.add("Ganesh");
        players.add("Shiva");
        int rounds = 0;
        while (players.size() > 1) {
            int passes = (int) (Math.random() * players.size()) + 1;
            System.out.println("Passes this round: " + passes);
            for (int i = 0; i < passes; i++) {
                String player = players.remove();
                players.add(player);
            }
            String eliminatedPlayer = players.remove();
            System.out.println("Player eliminated: " + eliminatedPlayer);
            
            rounds++;
        }
        String winner = players.peek();
        System.out.println("Winner after " + rounds + " rounds: " + winner);
	}

}
