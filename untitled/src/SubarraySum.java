import java.util.ArrayList;

public class SubarraySum {
    static ArrayList<Integer> subarraySum(int[] arr, int target) {
        ArrayList<Integer> res = new ArrayList<>();
        int n = arr.length;

        for (int s = 0; s < n; s++) {
            int sum = 0;
            for (int e = s; e < n; e++) {
                sum += arr[e];
                if (sum == target) {
                    res.add(s + 1);
                    res.add(e + 1);
                    return res;
                } else if (sum>target) { break;}
            }
        }
        res.add(-1);
        return res;
    }
    public static void main(String[] args) {
        int[] arr = {15, 2, 4, 8, 9, 5, 10, 23};
        int target = 23;
        ArrayList<Integer> res = subarraySum(arr, target);

        for (int ele : res)
            System.out.print(ele + " ");
    }
}
