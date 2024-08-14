package bubbleSort;

public class BubbleSort {

    // Method to perform Bubble Sort on an array
    public static void bubbleSort(int[] array){
        int n = array.length;
        boolean swapped;

        for(int i=0; i< n-1; i++){
            swapped = false;

            // Last i element are already in place
            for(int j = 0; j < n - 1; j++){
                //Swap if the element found is greater that the next element
                if(array[j] > array[j+1]){
                    // Swap array[j] amd array[j+1]
                    int temp = array[j];
                    array[j] = array[j+1];
                    array[j+1] = temp;

                    swapped = true;
                }
            }

            // if no elements were swapped in the inner loop
            if(!swapped){
                break;
            }
        }
    }

    // Method to print an array
    public static void printArray(int[] array){
        for(int i : array) {
            System.out.print(i + " ");
        }
        System.out.println();
    }

    // Main method to test the bubble sorting algoritm
    public static void main(String[] args){
        int[] array = {64, 34, 25, 12, 22, 11, 90};

        System.out.println("Original array:");
        printArray(array);

        bubbleSort(array);

        System.out.println("Sorted array:");
        printArray(array);
    }
}
