import java.util.HashMap;

public class Hashing13 {
    public static void main(String[] args) {

        // int arr[] = { 1, 3, 2, 4 };
        // int k = 4;
        // int count = 0;
        // int sum = 0;
        // for (int i = 0; i < arr.length; i++) {
        //     sum = 0;
        //     for (int j = i; j < arr.length; j++) {
        //         sum += arr[j];
        //         if (sum % k == (j - i + 1)) {
        //             count++;
        //         }
        //     }
        // }
        // System.out.println(count);



        int num[] = {1, 3, 2, 4};
        int k = 4;
        // output: 2
        int count=0;
        HashMap<Integer,Integer> hp = new HashMap<>();
        int prefixSum=0;
        hp.put(0,1);
        for(int i=0;i<num.length;i++){
        prefixSum+=num[i];
        int key=(prefixSum %k )-i;
            if(hp.containsKey(key)){
                count+=hp.get(key);
            }
        hp.put(key,hp.getOrDefault(key,0)+1);
        }
        System.out.println(count);

    }
}