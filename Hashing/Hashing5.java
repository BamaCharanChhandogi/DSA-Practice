package Hashing;

public class Hashing5 {
    public static int[] prefixSum(int nums[]){
        int prefixSum[] = new int[nums.length];
        prefixSum[0] = nums[0];
        for(int i=1;i<nums.length;i++){
            prefixSum[i] = prefixSum[i-1]+nums[i];
        }
        return prefixSum;
    }
    public static int getRange(int nums[],int l,int r){
        return nums[r]- nums[l-1];
    }
    public static void main(String[] args) {
        int nums[] = {0, 1, 2, 4, 5, 6, 7, 8, 9};
        int l = 3;
        int r = 7;
        int getPrefixArray[] = prefixSum(nums);
        System.out.println(getRange(getPrefixArray, l, r));
    }
}
