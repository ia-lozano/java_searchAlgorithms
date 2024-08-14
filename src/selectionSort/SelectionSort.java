package selectionSort;

public class SelectionSort {

    public void sort(int[] array){
        int n = array.length;

        // one by one move boundary of unsorted subarray
        for(int i = 0; i<n; i++){
            // Find the index of the minimum element in the unsorted part
           int minIndex = i;
           for (int j = i + 1; j<n; j++){
               if(array[j] < array[minIndex]){
                   minIndex = j;
               }
           }
           // Swap the found minimum element with the first element of the unsorted part
           if(minIndex != i){
               int temp = array[i];
               array[i] = array[minIndex];
               array[minIndex] = temp;
           }
        }
    }
    // Method to print the array
    public void printArray(int[] array){
        for(int value : array){
            System.out.print(value + " ");
        }
        System.out.println();
    }

    public static void main(String[] args){

        SelectionSort sorter = new SelectionSort();

        int[] array = {64, 25, 12, 22, 11};

        System.out.println("Original array:");
        sorter.printArray(array);

        sorter.sort(array);

        System.out.println("Sorted array:");
        sorter.printArray(array);
    }
}

