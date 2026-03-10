package Java_Assignment3.Module7.SortAndSearchAlgorithms;

public class CompareSorting {

    static void bubbleSort(int arr[]) {
        int n = arr.length;

        for (int i = 0; i < n - 1; i++) {
            for (int j = 0; j < n - i - 1; j++) {

                if (arr[j] > arr[j + 1]) {

                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
            }
        }
    }

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

    static void printArray(int arr[]) {
        for (int i = 0; i < arr.length; i++)
            System.out.print(arr[i] + " ");
        System.out.println();
    }

    public static void main(String args[]) {

        int arr1[] = {9, 4, 6, 2, 7};
        int arr2[] = {9, 4, 6, 2, 7};
        int arr3[] = {9, 4, 6, 2, 7};

        bubbleSort(arr1);
        selectionSort(arr2);
        insertionSort(arr3);

        System.out.println("Bubble Sort:");
        printArray(arr1);

        System.out.println("Selection Sort:");
        printArray(arr2);

        System.out.println("Insertion Sort:");
        printArray(arr3);

        System.out.println("\nTime Complexity Comparison:");
        System.out.println("Bubble Sort -> Best: O(n), Worst: O(n^2)");
        System.out.println("Selection Sort -> Best/Worst: O(n^2)");
        System.out.println("Insertion Sort -> Best: O(n), Worst: O(n^2)");
        System.out.println("Merge Sort -> O(n log n)");
        System.out.println("Quick Sort -> Average: O(n log n), Worst: O(n^2)");
    }
}

