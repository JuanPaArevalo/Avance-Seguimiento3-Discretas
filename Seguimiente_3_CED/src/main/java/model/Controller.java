package model;

import java.util.*;

public class Controller {
    private int arrNum[];

    public Controller() {
        arrNum = new int[]{1, 2, 2, 3, 4, 4, 4, 5, 6, 6};
    }

    public String orderValues() {
        List<Integer> duplicates = new ArrayList<>();

        for (int i = 0; i < arrNum.length - 1; i++) {
            if (arrNum[i] == arrNum[i + 1] && (duplicates.isEmpty() || duplicates.get(duplicates.size() - 1) != arrNum[i])) {
                duplicates.add(arrNum[i]);
            }
        }

        return duplicates.toString();
    }

    public boolean palindrome(String word) {
        String reversed = new StringBuilder(word).reverse().toString();
        return word.equalsIgnoreCase(reversed);
    }

    public int bitCounter(String bits){
        int count = 0;
        for (char bit : bits.toCharArray()) {   //Complejidad O(n). Depende de la longitud de cadena enviada.
            //Mejor caso = O(n), Peor caso O(n). Siempre recorrerá longitud entera de cadena
            if (bit == '1') {
                count++;
            }
        }
        return count; //metodo que retorna conteo de 1s en una cadena de bits
    }
}