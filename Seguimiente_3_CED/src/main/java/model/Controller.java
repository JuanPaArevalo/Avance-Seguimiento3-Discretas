package model;

import java.util.*;

public class Controller {
    private int arrNum[];

    public Controller() {
        arrNum = new int[]{1, 2, 2, 3, 4, 4, 4, 5, 6, 6};
    }

    public List<Integer> orderValues() {

        List<Integer> duplicates = new ArrayList<>(); // Se repite 1 vez

        /* El peor caso es cuando tenemos una lista asi : [1,1,2,2,3,3,4,4...], ya que de esta manera
        hacemos que el programa tenga que hacer el mayor número de operaciones, por que el cuerpo del if se ejecutaria n/2 aproximadamente,
        que es el número más grande de veces que el programa podria ejecutar esta linea. */

        for (int i = 0; i < arrNum.length - 1 ; i++) { /*Se repite n veces ( n = longitud del arreglo ). Se repite n veces porque la i empieza en 0
            y como el ciclo se va a repetir mientras i sea menor que n - 1 se repetiria n - 1 veces, pero como el programa tiene que comprobar una ultima vez
            la condición, entonces se agrega una ultima ejecución a n - 1, es decir, n-1+1 = n. */

            if (arrNum[i] == arrNum[i + 1] && (duplicates.isEmpty() || duplicates.get(duplicates.size() - 1) != arrNum[i])) { /* n - 1 veces, ya que el ciclo va
                a ejecutar las lineas que están dentro de él las veces que se repita el ciclo (n) menos una iteración. Como en este caso el numero de veces que se
                repite el ciclo (el ciclo "for") es n, entonces las veces que se va a repetir este if son n - 1 veces */

                duplicates.add(arrNum[i]); /*n/2 veces aprox. El peor caso es cuando tenemos una lista asi : [1,1,2,2,3,3,4,4...], ya que de esta manera
                hacemos que el programa tenga que hacer el mayor número de operaciones, por que el cuerpo del if se ejecutaria n/2 aproximadamente,
                que es el número más grande de veces que el programa podria ejecutar esta linea. */
            }
        }

        return duplicates; // 1 vez

        /*
        Suma: 1 + n + n - 1 + n/2 + 1 = 2n + n/2 + 1
        big O: O(n)
         */
    }

    public boolean palindrome(String word) {
        int left = 0; // Se ejecuta 1 vez
        int right = word.length() - 1; // Se ejecuta 1 vez

        while (left < right) { //Se ejecuta n veces
            if (word.charAt(left) != word.charAt(right)) { // Se ejecutará n - 1 veces. Complejidad O(1)
                return false; //Se ejecuta n - 1 veces. Complejidad O(1)
            }
            left++; //Se ejecuta n - 1 veces. Complejidad O(1)
            right--; //Se ejecuta n - 1 veces. Complejidad O(1)
        }

        return true; //Se ejecuta 1 vez
    }


    public int bitCounter(String bits){
        int count = 0; // Se ejecuta 1 vez
        for (char bit : bits.toCharArray()) {   //Complejidad O(n). Depende de la longitud de cadena enviada.
            //Mejor caso = O(n), Peor caso O(n). Siempre recorrerá longitud entera de cadena
            if (bit == '1') {
                count++;
            }
        }
        return count; //metodo que retorna conteo de 1s en una cadena de bits
    }
}