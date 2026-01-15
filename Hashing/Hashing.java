package Hashing;

import java.util.HashMap;
import java.util.Map;

public class Hashing {
    public static void main(String[] args) {
        int arr[] = {1, 1, 3, 1, 2, 3};
        HashMap<Integer,Integer> mp = new HashMap<>();
        for(int i:arr){
            mp.put(i, mp.getOrDefault(i, 0)+1);
        }
        int min = Integer.MAX_VALUE;
        int max = Integer.MIN_VALUE;
        int ans  = 0;int ans2=0;
        for(Map.Entry<Integer,Integer> hp:mp.entrySet()){
            if(hp.getValue()<=min){
                ans = hp.getKey();
                min = hp.getValue();
            }
            else if(hp.getValue()>max){
                max=hp.getValue();
                ans2=hp.getKey();
            }
        }
        System.out.println(ans+" "+ans2);
    }
}
