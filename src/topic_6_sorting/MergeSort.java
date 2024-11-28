package topic_6_sorting;

import java.util.Scanner;


public class MergeSort {

    private static int totalElements;

    public static void insertionSort(int[] numbers) {
        int length = numbers.length;
        for (int currentIndex = 1; currentIndex < length; currentIndex++) {
            int currentValue = numbers[currentIndex];
            int previousIndex = currentIndex - 1;

            while (previousIndex >= 0 && numbers[previousIndex] > currentValue) {
                numbers[previousIndex + 1] = numbers[previousIndex];
                previousIndex = previousIndex - 1;
            }
            numbers[previousIndex + 1] = currentValue;
        }
    }

    public static void printArray(int[] numbers) {
        for (int value : numbers) {
            System.out.print(value + " ");
        }
        System.out.println();
    }

    public static void main(String[] args) {
        try (Scanner inputScanner = new Scanner(System.in)) {
            System.out.print("Enter the number of elements in the array: ");
            int numberOfElements = inputScanner.nextInt();
            int[] numbers = new int[totalElements];
            System.out.println("Enter the elements of the array:");
            int[] array = null;
            for (int i = 0; i < numberOfElements; i++) {
                array[i] = inputScanner.nextInt();
            }
            System.out.println("Original array:");
            printArray(numbers);
            long startTime = System.currentTimeMillis();
            insertionSort(numbers);
            long endTime = System.currentTimeMillis();
            long timeTaken = endTime - startTime;
            System.out.println("Sorted array:");
            printArray(array);
            System.out.println("Sorting completed in: " + timeTaken + " milliseconds");
        }
        int[] numbers = new int[totalElements];

        System.out.println("Enter the elements of the array:");
        for (int i = 0; i < totalElements; i++) {
            numbers[i] = inputScanner.nextInt();
        }

        System.out.println("Original array:");
        printArray(numbers);

        long startTime = System.currentTimeMillis();
        insertionSort(numbers);
        long endTime = System.currentTimeMillis();
        long timeTaken = endTime - startTime;

        System.out.println("Sorted array:");
        printArray(numbers);
        System.out.println("Sorting completed in: " + timeTaken + " milliseconds");

        inputScanner.close();
    }

    private static class inputScanner {

        private static int nextInt() {
            throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
        }

        private static void close() {
            throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
        }

        public inputScanner() {
        }
    }
}
