package com.company;

// Napisz pętlę for, która wypisze na ekranie wszystkie liczby nieparzyste od -10 do 40.

public class Pętla2 {
    public static void main(String[] args) {
        for(int numb = -10; numb <= 40; numb++) {
            if (numb % 2 != 0) {
                System.out.println(numb);
            }
        }
    }
}
