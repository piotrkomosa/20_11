import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class Logic {
    public static final String endOfProgram = "stop";
    public static Scanner scanner = new Scanner(System.in);
    static void addPlayers() {
        ArrayList<Player> players = new ArrayList<>();
        System.out.println("Podaj wynik kolejnego gracza (lub STOP):");
        Player player = new Player();
        String inputUser = scanner.nextLine();

        do{players.add(new Player(scanner.nextLine(), scanner.nextLine(), scanner.nextDouble()));
            scanner.close();
            for (Player playerResult : players) {
                PlayerComparator playerComparator = new PlayerComparator();
                Collections.sort(players,playerComparator);
            }
        }
            while(inputUser.equals(Logic.endOfProgram));
            System.out.println("Koniec programu");
    }
}

