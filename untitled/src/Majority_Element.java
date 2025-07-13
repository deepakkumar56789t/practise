import java.util.*;

public class Majority_Element {

    public static int majorityElement(int[] nums) {
        LinkedHashMap<Integer, Integer> map = new  LinkedHashMap<>();
        for(Integer I:nums){
            if(map.containsKey(I)){
                map.put(I, map.get(I) + 1);
            }else{map.put(I, 1);}
        }
        int majorityElement = 0;int majorityKey = 0;
        Set<Integer> keys=map.keySet();
        for(Integer key:keys){
            if(map.get(key) > majorityElement){
                majorityElement=map.get(key);majorityKey=key;}
        }
    return majorityKey;
    }
    public static void main(String[] args) {
        int[] arr={1,2,3,3,3,3,3,3,3,3,3,3,3,3,3,4,5,2,2,3,2,2,2,2,3,4};
        System.out.println(Majority_Element.majorityElement(arr));
    }
}
