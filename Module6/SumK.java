package Java_Assignment3.Module6;

public class SumK {
    public static void main(String[] args) {
        int[] arr={12,17,10,11};
        int target=22;
        for (int i = 0; i < arr.length ; i++) {
            for (int j = i+1; j < arr.length ; j++) {
                if (arr[i]+arr[j]==target){
                    System.out.println(arr[i]+" and "+arr[j]);
                    System.out.println("At indexes:"+i+","+j);
                }
            }

        }
    }
}

