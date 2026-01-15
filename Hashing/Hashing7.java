package Hashing;

import java.util.HashMap;

public class Hashing7 {
    public static void main(String[] args) {
        int arr[] = { 1, 2, 3, 4, 5 };
        int k = 5;
        int max = Integer.MIN_VALUE;
        int sum=0;
        int startIndex=0;
        int endIndex=0;
        HashMap<Integer, Integer> hp = new HashMap<>();
        hp.put(0,-1);
        for (int i = 0; i < arr.length; i++) {
            sum += arr[i];
            if (hp.containsKey(sum - k) && (i - hp.get(sum-k))> max) {                
                startIndex = hp.get(sum-k)+1;
                endIndex = i;
                max=i - hp.get(sum-k);
            }
            hp.putIfAbsent(sum, i);
        }
        System.out.println(startIndex+ " "+ endIndex);
    }
}
