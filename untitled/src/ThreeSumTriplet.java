public class ThreeSumTriplet {
    public static int closest3Sum(int[] arr, int target){
        int n=arr.length;
        int sum=0;
        int res=0;
        int minLower =Integer.MAX_VALUE;
        for (int i = 0; i < n-2 ; i++) {
            int l=i+1;
            int r=n-1;
            while (l < r) {
                sum=arr[i]+arr[r]+arr[l];
                if (Math.abs(sum-target)==minLower) {
                    res=Math.max(res, sum);
                } else if (Math.abs(sum-target)<minLower) {
                    minLower=Math.abs(sum-target);
                    res=sum;
                }
                if(sum>target){
                    r--;
                }else {
                    l++;
                }
            }
        }

        return res;
    }
    public static void main(String[] args) {
        int[] arr = {-1, 2, 2, 4};
        int target = 4;
        System.out.println(closest3Sum(arr, target));
    }
}
