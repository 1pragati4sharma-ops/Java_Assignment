package Java_Assignment4.Module9;
//Leetcode78 - Subsets
import java.util.ArrayList;
import java.util.List;

public class Subset {
    static void ArrSet(int[] arr, int index, List<Integer> current){
        if (index== arr.length ) {
            System.out.println(current);
            return;
        }
        //Add the element
        current.add(arr[index]);
        ArrSet(arr, index+1, current);
        //BackTracking
        current.remove(current.size()-1);
        //Skip and Explore
        ArrSet(arr, index+1, current);
    }

    public static void main(String[] args) {
        int[] arr={1,2,3};
        ArrSet(arr,0,new ArrayList<>());
    }
}
