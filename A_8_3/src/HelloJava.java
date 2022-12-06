// Scanner Klasse importieren
import java.util.Scanner;

public class HelloJava {
    // Main Funktion
    public static void main(String[] args) {
        // Scanner für das Einlesen von Konsolen eingaben
        Scanner scanner = new Scanner(System.in);

        // Werte initialisieren
        int i = 0;
        int num = 0;

        //Leere Ausgabestring
        String  primeNumbers = "";

        // Nutzereingabe
        System.out.println("Gib einen Wert für n an:");
        int n = scanner.nextInt();
        scanner.close();

        // Berechnung der Werte bis n
        for (i = 1; i <= n; i++){
            int counter=0;

            for(num = i; num >= 1; num--){
                if(i%num == 0){
                    counter = counter + 1;
                }
            }

            if (counter == 2) {
                primeNumbers = primeNumbers + i + " ";
            }
        }

        // Ausgabe
        System.out.println("Berechnete Zahlen bis n :");
        System.out.println(primeNumbers);
    }
}