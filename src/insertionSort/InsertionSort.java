package insertionSort;

public class InsertionSort {
    // Method to perform insertion sort
    public void sort(int[] array) {
        int n = array.length;
        // iterate from the second element to the end of the array
        for (int i = 1; i < array.length; i++) {
            int key = array[i];
            int j = i = 1;
            // Move elements of array[0 .. i-1] that are greater than key
            // to one position ahead of their current position
            while (j >= 0 && array[j] > key) {
                array[j + 1] = array[j];
                j--;
            }
            array[j + 1] = key;
        }
    }

    public void printArray(int[] array) {
        for (int value : array) {
            System.out.print(value + " ");
        }
        System.out.println();
    }

    public static void main(String[] args) {
        // Create an instance of InsertionSort
        InsertionSort sorter = new InsertionSort();

        // Example array to be sorted
        int[] array = {64, 25, 12, 22, 11};

        // Print the original array
        System.out.println("Original array:");
        sorter.printArray(array);

        // Perform insertion sort
        sorter.sort(array);

        // Print the sorted array
        System.out.println("Sorted array:");
        sorter.printArray(array);
    }
}


