import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Scanner;

public class Logic {
    public static final String endOfProgram = "STOP";
    public static Scanner scanner = new Scanner(System.in);

    static void addPlayers() {
        ArrayList<Player> players = new ArrayList<>();
        System.out.println("Podaj wynik kolejnego gracza (lub STOP):");
        String inputUser = scanner.nextLine();
        do {
            Player player = new Player();
            System.out.println("podaj imie");
            player.setFirstName(scanner.nextLine());
            System.out.println("podaj nazwisko");
            player.setLastName(scanner.nextLine());
            System.out.println("podaj wynik");
            player.setScore(scanner.nextDouble());
            players.add(new Player(scanner.nextLine(), scanner.nextLine(), scanner.nextDouble()));
            System.out.println(player.getFirstName()+" "+player.getLastName()+";" +player.getScore());
        }
        while (inputUser.equals(endOfProgram));
        System.out.println("Koniec programu");
    }
    private static void sortPlayers(ArrayList<Player> players) {
        for (Player p : players) {
            PlayerComparator playerComparator = new PlayerComparator();
            Collections.sort(players, playerComparator);
        }
    }
}
