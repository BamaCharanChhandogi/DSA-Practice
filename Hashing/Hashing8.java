package Hashing;

import java.util.HashMap;

public class Hashing8 {
    public static int[] getMaximum(int arr[],int k){
        int max = Integer.MIN_VALUE;
        int sum=0;
        int count=0;
        HashMap<Integer, Integer> hp = new HashMap<>();
        hp.put(0,-1);
        for (int i = 0; i < arr.length; i++) {
            sum += arr[i];
            if (hp.containsKey(sum - k) && (i - hp.get(sum-k))> max) {  
                count=1;              
                max=i - hp.get(sum-k);
            }
            else if(hp.containsKey(sum - k) && (i - hp.get(sum-k))==max){
                count++;
            }
            hp.putIfAbsent(sum, i);
        }
        return new int[]{max,count};
    }
    public static int[] getMinimum(int arr[],int k){
        int max = Integer.MAX_VALUE;
        int sum=0;
        int count=0;
        HashMap<Integer, Integer> hp = new HashMap<>();
        hp.put(0,-1);
        for (int i = 0; i < arr.length; i++) {
            sum += arr[i];
            if (hp.containsKey(sum - k) && (i - hp.get(sum-k))< max) {  
                count=1;              
                max=i - hp.get(sum-k);
            }
            else if(hp.containsKey(sum - k) && (i - hp.get(sum-k))==max){
                count++;
            }
            hp.putIfAbsent(sum, i);
        }
        return new int[]{max,count};
    }
    public static void main(String[] args) {
        int n = 9;
        int k = 5;
        int[] arr = {1, 2, 3, 4, 2,1,2,2, 5,5};
        int max[] = getMaximum(arr,k);
        int min[] = getMinimum(arr,k);
        System.out.println("Maximum Length "+max[0]+" Count: "+max[1]);
        System.out.println("Maximum Length "+min[0]+" Count: "+min[1]);

        String ans = "Bama";
        for(Character ch:ans.toCharArray()){
            System.out.println(ch);
        }
    }
}
