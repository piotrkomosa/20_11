import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;


public class Logic {
    public static final String endOfProgram = "STOP";
    public static Scanner scanner = new Scanner(System.in);


    public static void addPlayers() throws IOException {
        List<Player> players = new ArrayList<>();
        System.out.println("Podaj wynik kolejnego gracza (lub STOP):");
        String inputUser = scanner.nextLine();
        while (!inputUser.equals(endOfProgram)) {
            System.out.println("podaj imie");
            String firstName = scanner.nextLine();
            System.out.println("podaj nazwisko");
            String lastName = scanner.nextLine();
            System.out.println("podaj wynik");
            Double score = scanner.nextDouble();
            Player player = new Player(firstName, lastName, score);
            System.out.println("Podaj wynik kolejnego gracza (lub STOP):");
       } System.out.println("Koniec programu");
        sortPlayers(players);
        writeToFile(players, "stats.csv");
    }
    private static void sortPlayers(List<Player> players) {
        for (Player p : players) {
            PlayerComparator playerComparator = new PlayerComparator();
            Collections.sort(players, playerComparator);
        }
    }

    static void writeToFile(List<Player> player, String fileName) throws IOException {
        String inputUser = scanner.nextLine();
        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(fileName));
        while (inputUser.equals(endOfProgram)) {
            bufferedWriter.write(player.toString());

        }
        bufferedWriter.close();
    }
}




