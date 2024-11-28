package topic_6_sorting;

import java.util.Scanner;

public class InsertionSort {

    public static void insertionSort(int[] array) {
        int length = array.length;
        for (int currentIndex = 1; currentIndex < length; currentIndex++) {
            int currentValue = array[currentIndex];
            int previousIndex = currentIndex - 1;

            while (previousIndex >= 0 && array[previousIndex] > currentValue) {
                array[previousIndex + 1] = array[previousIndex];
                previousIndex = previousIndex - 1;
            }
            array[previousIndex + 1] = currentValue;
        }
    }

    public static void printArray(int[] array) {
        for (int value : array) {
            System.out.print(value + " ");
        }
        System.out.println();
    }

    public static void main(String[] args) {
        try (Scanner inputScanner = new Scanner(System.in)) {
            System.out.print("Enter the number of elements in the array: ");
            int numberOfElements = inputScanner.nextInt();
            int[] array = new int[numberOfElements];
            
            System.out.println("Enter the elements of the array:");
            for (int i = 0; i < numberOfElements; i++) {
                array[i] = inputScanner.nextInt();
            }
            
            System.out.println("Original array:");
            printArray(array);
            
            long startTime = System.currentTimeMillis();
            insertionSort(array);
            long endTime = System.currentTimeMillis();
            long timeTaken = endTime - startTime;
            
            System.out.println("Sorted array:");
            printArray(array);
            System.out.println("Sorting completed in: " + timeTaken + " milliseconds");
        }
    }
}
