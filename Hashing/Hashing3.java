package Hashing;

import java.util.HashMap;

public class Hashing3 {
    public static int countAllPairs(int arr[],int k){
        HashMap<Integer,Integer> hp = new HashMap<>();
        int count =0;
        for(int i=0;i<arr.length;i++){
            int num = arr[i];
            int rem = k - arr[i];
            if(hp.containsKey(rem)){
                count++;
            }
            hp.put(num, hp.getOrDefault(num, 0)+1);
        }
        return count;
    }
    public static void main(String[] args) {
        int arr[] = {1, 3, 4, 5};
        int k = 6;
        System.out.println(countAllPairs(arr,k));
    }
}
