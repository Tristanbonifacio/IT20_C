package topic_6_sorting;

import java.util.Scanner;

public class QuickSort {

    public static void quickSort(int[] array, int lowIndex, int highIndex) {
        if (lowIndex < highIndex) {
            int partitionIndex = partition(array, lowIndex, highIndex);

            quickSort(array, lowIndex, partitionIndex - 1);
            quickSort(array, partitionIndex + 1, highIndex);
        }
    }

    private static int partition(int[] array, int lowIndex, int highIndex) {
        int pivotValue = array[highIndex];
        int i = lowIndex - 1;

        for (int j = lowIndex; j < highIndex; j++) {
            if (array[j] <= pivotValue) {
                i++;

                int temp = array[i];
                array[i] = array[j];
                array[j] = temp;
            }
        }

        int temp = array[i + 1];
        array[i + 1] = array[highIndex];
        array[highIndex] = temp;

        return i + 1;
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
            int totalElements = inputScanner.nextInt();
            int[] array = new int[totalElements];
            
            System.out.println("Enter the elements of the array:");
            for (int i = 0; i < totalElements; i++) {
                array[i] = inputScanner.nextInt();
            }
            
            System.out.println("Original array:");
            printArray(array);
            
            long startTime = System.currentTimeMillis();
            quickSort(array, 0, array.length - 1);
            long endTime = System.currentTimeMillis();
            long timeTaken = endTime - startTime;
            
            System.out.println("Sorted array:");
            printArray(array);
            
            System.out.println("Sorting completed in: " + timeTaken + " milliseconds");
        }
    }
}
