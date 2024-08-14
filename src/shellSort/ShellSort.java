package shellSort;

public class ShellSort {
    public void sort(int[] array) {
        int n = array.length;
        // Start with a big gap, then reduce the gap
        // Typical gap sequence is n/2, n/4, ..., 1
        for (int gap = n / 2; gap > 0; gap /= 2) {
            // Perform a gapped insertion sort for this gap size
            for (int i = gap; i < n; i++) {
                int key = array[i];
                int j = i;
                // Shift earlier gap-sorted elements up until the correct location for key is found
                while (j >= gap && array[j - gap] > key) {
                    array[j] = array[j - gap];
                    j -= gap;
                }
                array[j] = key;
            }
        }

    }

    public void printArray(int[] array){
        for (int value : array) {
            System.out.print(value + " ");
        }
        System.out.println();
    }
    
    public static void main(String[] args) {
        // Create an instance of ShellSort
        ShellSort sorter = new ShellSort();

        // Example array to be sorted
        int[] array = {64, 25, 12, 22, 11};

        // Print the original array
        System.out.println("Original array:");
        sorter.printArray(array);

        // Perform shell sort
        sorter.sort(array);

        // Print the sorted array
        System.out.println("Sorted array:");
        sorter.printArray(array);
    }
}