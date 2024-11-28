package topic_6_sorting;

public class BubbleSort {


    public static void bubbleSort(int[] array) {
        int length = array.length;
        for (int outerIndex = 0; outerIndex < length - 1; outerIndex++) {
            for (int innerIndex = 0; innerIndex < length - outerIndex - 1; innerIndex++) {
                if (array[innerIndex] > array[innerIndex + 1]) {
                    // Swap array[innerIndex] and array[innerIndex + 1]
                    int temporary = array[innerIndex];
                    array[innerIndex] = array[innerIndex + 1];
                    array[innerIndex + 1] = temporary;
                }
            }
        }
    }

    // Method to print the array
    public static void printArray(int[] array) {
        for (int value : array) {
            System.out.print(value + " ");
        }
        System.out.println();
    }

    public static void main(String[] args) {
        // Scanner to read input
        try (java.util.Scanner inputScanner = new java.util.Scanner(System.in)) {
            System.out.print("Enter the number of elements in the array: ");
            int numberOfElements = inputScanner.nextInt();
            int[] array = new int[numberOfElements];

            System.out.println("Enter the elements of the array:");
            for (int i = 0; i < numberOfElements; i++) {
                array[i] = inputScanner.nextInt();
            }

            System.out.println("Original array:");
            printArray(array);

            // Timing the sorting process
            long startTime = System.currentTimeMillis();
            bubbleSort(array);
            long endTime = System.currentTimeMillis();
            long timeTaken = endTime - startTime;

            System.out.println("Sorted array:");
            printArray(array);
            System.out.println("Sorting completed in: " + timeTaken + " milliseconds");
        }
    }
}
