package Hashing;

public class Hashing2 {
    public static boolean isEqal(int arr[],int k){
        int count =1;
        for(int i=1;i<arr.length;i++){
            if(arr[i]==arr[i-1]){
                count++;
            }
            if(count == k) return true;
        }
        return false;
    }
    public static void main(String[] args) {
        int arr[] = {1,1,2,3,45,5};
        int k = 2;
        if(isEqal(arr,k)){
            System.out.println("YES");
        }
        else{
            System.out.println("NO");
        }
    }
}
