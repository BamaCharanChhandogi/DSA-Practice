package Hashing;

import java.util.HashMap;

public class Hashing4 {
    public static int countPair(int arr[],int k){
        int count = 0;
        HashMap<Integer,Integer> hp = new HashMap<>();
        for(int i:arr){
            hp.put(i, hp.getOrDefault(i, 0)+1);
        }
        for(int i=0;i<arr.length;i++){
            int num = arr[i];
            int rem = Math.abs(num+k);
            if(k!=0 && hp.containsKey(rem)){
                count++;
            }

        }
        return count;
    }
    public static void main(String[] args) {
        int arr[] = {1, 7, 5, 9, 2, 12, 3};
        int k=2;

        System.out.println(countPair(arr,k));
    }
}
