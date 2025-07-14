import java.util.ArrayList;

public class NoOfSubArraySumEqaulK {

    public static int cntSubarrays(int[] arr, int k) {
     int count=0;
     int length=arr.length;
        ArrayList<ArrayList> ar=new ArrayList<>();
        for (int i = 0; i < length; i++) {
            int sum=0;
            ArrayList<Integer> pair=new ArrayList<>();
            for (int j = i; j < length; j++) {
                sum+=arr[j];
                pair.add(arr[j]);
                if (sum == k) {
                    count++;
                    ar.add(pair);
                    break;
                }
            }

        }
        System.out.println(ar);


     return count;
    }
    public static void main(String[] args) {
        int[] arr = {10, 2, -2, -20, 10};
        int k = -10;
        System.out.println(cntSubarrays(arr, k));
    }
}
