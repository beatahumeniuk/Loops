package com.company;

/* Napisz metodę, która jako jedyny argument przyjmie zmienną typu int[]
i zwróci sumę wszystkich elementów tablicy.
 */

public class Pętla3 {

        public static void main(String[] args) {
            int[] numbs = new int[] {1, 2, 3, 4, 5, 6, 7};
            System.out.println(sumArray(numbs));
        }

        private static int sumArray(int[] numbs) {
            int sum = 0;
            for (int numb : numbs) {
                sum += numb;
            }
            return sum;
        }
    }
