import java.util.Scanner;

public class GetColor {
    public static String GetUserLetter()
    {Scanner scanner = new Scanner(System.in);
        while (true) {
            System.out.println("Podaj litere:");
            String kolor = scanner.nextLine().trim().toUpperCase();
            switch (kolor) {
                case "B": return "Bialy";
                case "S": return "Szary";
                case "C": return "Czarny";
                case "Cz": return "Czerwony";
                case "Z": return "Zolty";
                case "N": return "Niebieski";
                case "F": return "Fioletowy";
                case "P": return "Pomaranczowy";
                case "R": return "Rozowy";
                default:
                    System.out.println("Nie ma takiego koloru w bazie. Podaj inna litere.");
            }
        }
    }

    public static void main(String[] args) {
        GetColor podajkolor = new GetColor();
        String result = podajkolor.GetUserLetter();
        System.out.println(result);
    }
}
