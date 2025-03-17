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

    public int bitCounter(int bits) {
        return Integer.bitCount(bits);
    }
}