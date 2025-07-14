import java.util.ArrayList;

public class PeakElement {
    static boolean left=false;
    static boolean right=false;
    static ArrayList<Integer> position=new ArrayList<>();
    public static void peakValue(int[] arr, int len){
        for(int i = 0; i < len; i++){
            if(i>0 && arr[i] > arr[i-1]){
                left=true;
            }
            if(i<len-1 && arr[i] > arr[i+1]){
                right=true;
            }
            if(left & right){
                position.add(i+1);
                left=false;right=false;
            }

        }
    }

    public static void main(String[] args) {
        int[] arrayAr={1,2,3,2,4,5,6,4,7,8};
        int len=arrayAr.length;
        PeakElement.peakValue(arrayAr,len);
        for(Integer key:position){
            System.out.println("Position of arrays of peak value is :- "+arrayAr[key-1]);
        }
    }
}
