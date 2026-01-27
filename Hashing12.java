public class Hashing12 {
    public static int[ ] prefixSum( int nums[] ) {
        int prefixArr[] = new int[nums.length];
        prefixArr[0] = nums[0];
        for( int i=1;i<nums.length;i++){
	        prefixArr[i] = prefixArr[i-1] + nums[i];
        }
        return prefixArr;
    }
    public static int getPrefix(int nums[] ,int start, int end){
        int min=start<=0?0:start;
        return  nums[end] - min ;
}
public static void main(String args[]) {
    int  nums[] = { 1, 4,1 };
    int prefixArr[] = prefixSum(nums);
    System.out.println(getPrefix(prefixArr, 0,2));
}

}