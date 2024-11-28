package topic_6_sorting;

import java.util.Scanner;

/**
 *
 * @author Ranin
 */
public class SelectionSort {

    public static void selectionSort(int[] numbers) {
        int length = numbers.length;
        for (int currentIndex = 0; currentIndex < length - 1; currentIndex++) {
            int minimumIndex = currentIndex;
            for (int compareIndex = currentIndex + 1; compareIndex < length; compareIndex++) {
                if (numbers[compareIndex] < numbers[minimumIndex]) {
                    minimumIndex = compareIndex;
                }
            }
            int tempValue = numbers[minimumIndex];
            numbers[minimumIndex] = numbers[currentIndex];
            numbers[currentIndex] = tempValue;
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
            int totalElements = inputScanner.nextInt();
            int[] numbers = new int[totalElements];
            
            System.out.println("Enter the elements of the array:");
            for (int i = 0; i < totalElements; i++) {
                numbers[i] = inputScanner.nextInt();
            }
            
            System.out.println("Original array:");
            printArray(numbers);
            
            long startTime = System.currentTimeMillis();
            selectionSort(numbers);
            long endTime = System.currentTimeMillis();
            long timeTaken = endTime - startTime;
            
            System.out.println("Sorted array:");
            printArray(numbers);
            
            System.out.println("Sorting completed in: " + timeTaken + " milliseconds");
        }
    }
}
