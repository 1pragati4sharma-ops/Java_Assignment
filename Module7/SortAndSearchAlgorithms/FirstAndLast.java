package Java_Assignment3.Module7.SortAndSearchAlgorithms;

public class FirstAndLast {

    static int firstOccurrence(int arr[], int key) {
        int low = 0, high = arr.length - 1, result = -1;

        while(low <= high){
            int mid = (low + high) / 2;

            if(arr[mid] == key){
                result = mid;
                high = mid - 1;
            }
            else if(arr[mid] < key)
                low = mid + 1;
            else
                high = mid - 1;
        }
        return result;
    }

    static int lastOccurrence(int arr[], int key){
        int low = 0, high = arr.length - 1, result = -1;

        while(low <= high){
            int mid = (low + high) / 2;

            if(arr[mid] == key){
                result = mid;
                low = mid + 1;
            }
            else if(arr[mid] < key)
                low = mid + 1;
            else
                high = mid - 1;
        }
        return result;
    }

    public static void main(String args[]){
        int arr[] = {2,4,4,4,6,8,10};
        int key = 4;

        System.out.println("First: " + firstOccurrence(arr,key));
        System.out.println("Last: " + lastOccurrence(arr,key));
    }
}
