import java.util.ArrayList;
import java.util.Scanner;

public class Logic {
    public static final String endOfProgram = "STOP";
    public static Scanner scanner = new Scanner(System.in);


    static void addPlayers(){
        ArrayList<Player> players = new ArrayList<>();

        Player player = new Player();
        String inputUser= scanner.nextLine();
        do{
            System.out.println("Podaj wynik kolejnego gracza (lub STOP):");
            System.out.println("Podaj imie, nazwisko i wynik");
            players.add(new Player(scanner.nextLine(),scanner.nextLine(),scanner.nextDouble()));
            scanner.close();
        } while(inputUser.equals(Logic.endOfProgram));
    }
}
