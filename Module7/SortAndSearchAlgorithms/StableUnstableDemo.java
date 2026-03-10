package Java_Assignment3.Module7.SortAndSearchAlgorithms;

public class StableUnstableDemo {

    // Stable Sort (Insertion Sort)
    static void insertionSort(int arr[]) {
        int n = arr.length;

        for (int i = 1; i < n; i++) {
            int key = arr[i];
            int j = i - 1;

            while (j >= 0 && arr[j] > key) {
                arr[j + 1] = arr[j];
                j--;
            }

            arr[j + 1] = key;
        }
    }

    // Unstable Sort (Selection Sort)
    static void selectionSort(int arr[]) {
        int n = arr.length;

        for (int i = 0; i < n - 1; i++) {

            int minIndex = i;

            for (int j = i + 1; j < n; j++) {
                if (arr[j] < arr[minIndex])
                    minIndex = j;
            }

            int temp = arr[i];
            arr[i] = arr[minIndex];
            arr[minIndex] = temp;
        }
    }

    static void printArray(int arr[]) {
        for (int i = 0; i < arr.length; i++)
            System.out.print(arr[i] + " ");
        System.out.println();
    }

    public static void main(String args[]) {

        int arr1[] = {4, 3, 2, 3, 1};
        int arr2[] = {4, 3, 2, 3, 1};

        System.out.println("Original Array:");
        printArray(arr1);

        insertionSort(arr1);
        System.out.println("After Insertion Sort (Stable):");
        printArray(arr1);

        selectionSort(arr2);
        System.out.println("After Selection Sort (Unstable):");
        printArray(arr2);
    }
}

