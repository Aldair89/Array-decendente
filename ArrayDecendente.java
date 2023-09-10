
package com.mycompany.array.decendente;


public class ArrayDecendente {

    public static void main(String[] args) {
       int[] array = {5, 2, 8, 12, 1, 6, 3};
        System.out.println("Array antes de ordenar:");
        printArray(array);

        bubbleSortDescending(array);

        System.out.println("Array después de ordenar en forma descendente:");
        printArray(array);
    }

    public static void bubbleSortDescending(int[] array) {
        int n = array.length;
        for (int i = 0; i < n - 1; i++) {
            for (int j = 0; j < n - i - 1; j++) {
                if (array[j] < array[j + 1]) {
                    // Intercambiar elementos si están en el orden incorrecto
                    int temp = array[j];
                    array[j] = array[j + 1];
                    array[j + 1] = temp;
                }
            }
        }
    }

    public static void printArray(int[] array) {
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + " ");
        }
        System.out.println();
    }
}
