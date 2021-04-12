package com.company;

// Przerób funkcję z poprzedniego zadania tak, żeby metoda przyjmowała tablicę dwuwymiarową typu int[][]

// --->> czyli z pętla3

public class Pętla4 {
    public static void main(String[] args) {
        int[][] numbs = new int[][] {new int[] {1, 2}, new int[] {3, 4}, new int[] {5, 6, 7}};
        System.out.println(sumArray(numbs)); }

    private static int sumArray(int[][] numbs) {
        int sum = 0;
        for (int[] otherNumbs : numbs) {
            for (int numb : otherNumbs) {
                sum += numb;
            }
        }
        return sum;
    }

}
