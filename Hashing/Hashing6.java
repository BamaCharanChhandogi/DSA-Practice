package Hashing;

import java.util.HashMap;

public class Hashing6 {
    public static void main(String[] args) {
        int arr[] = { 1, 2, 3, 4, 5 };
        int k = 5;
        HashMap<Integer, Integer> hp = new HashMap<>();
        int count =0;int sum=0;
        for (int i = 0; i < arr.length; i++) {
            sum += arr[i];
            if (hp.containsKey(sum - k)) {
                count++;
            }
            hp.put(sum, hp.getOrDefault(sum, 0) + 1);
        }
        System.out.println(count);

    }
}
