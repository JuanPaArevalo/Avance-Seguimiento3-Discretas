package ui;

import model.Controller;
import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        Controller cont = new Controller();

        int opt = 0;
        while (opt != 4) {
            System.out.println("Menu:");
            System.out.println("1. Para ordenar lista");
            System.out.println("2. Para analizar palindromo");
            System.out.println("3. Para analizar conteo de bits");
            System.out.println("4. Para salir");

            opt = in.nextInt();
            in.nextLine();

            switch (opt) {
                case 1:
                    System.out.println("Valores repetidos: " + cont.orderValues());
                    break;
                case 2:
                    System.out.println("Inserte la palabra a analizar");
                    String word = in.nextLine().toLowerCase();
                    System.out.println("Es palindromo: " + cont.palindrome(word));
                    break;
                case 3:
                    System.out.println("Inserte su cadena de bits:");
                    String bits = in.nextLine();

                    int result = cont.bitCounter(bits);
                    System.out.println("Número de '1's en tu cadena: "+result);

                    cont.bitCounter(bits);
                    break;
                case 4:
                    System.out.println("Gracias");
                    in.close();
                    System.exit(0);
                    break;
                default:
                    System.out.println("Por favor intente de nuevo");
                    break;
            }
        }
    }
}
