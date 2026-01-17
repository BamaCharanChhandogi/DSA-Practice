// public class session10 {
//     public static int calCulateLeftMax(int i,int arr[]){
//         int curr=0;
//         int ans=0;
//         for(int k=0;k<=i;k++){
//             curr+=arr[k];
//             if(curr<0){
//                 curr = 0;
//             }
//             ans = Math.max(ans,curr);
//         }
//         return ans;
//     }
//     public static int calculateRightMax(int i,int arr[]){
//         int curr=0;
//         int ans=0;
//         for(int k=arr.length-1;k>=i;k--){
//             curr+=arr[k];
//             if(curr<0){
//                 curr = 0;
//             }
//             ans = Math.max(ans,curr);
//         }
//         return ans;
//     }
//     public static void main(String[] args) {
//         int arr[] = {2,5,-1,2,-10,1,5};
//         int ans = 0;
//         for(int i=0;i<arr.length;i++){
//             // first 0 to i
//             int leftMax = calCulateLeftMax(i,arr);
//             // second i+1 to n-1
//             int rightMax = calculateRightMax(i+1,arr);
//             int TotalMax = leftMax+rightMax;
//             ans = Math.max(ans,TotalMax);
//         }
//         System.out.println(ans);    
//     }
// }


// Optimized code
public class session10 {
    public static void main(String[] args) {
        int arr[] = {2,5,-1,2,-10,1,5};
        int n = arr.length;
        int prefixArray[] = new int[n];
        int suffixArray[] = new int[n];
        
        prefixArray[0]= Math.max(arr[0],0);
        int maxPrefix = arr[0];
        for(int i=1;i<n;i++){
            maxPrefix = Math.max(maxPrefix+arr[i],arr[i]);
            prefixArray[i] = Math.max(prefixArray[i-1],maxPrefix);
        }

        suffixArray[n-1]= Math.max(arr[n-1],0);
        int maxSufix = arr[n-1];
        for(int i=n-2;i>=0;i--){
            maxSufix = Math.max(maxSufix+arr[i],arr[i]);
            suffixArray[i] = Math.max(suffixArray[i+1],maxSufix);
        }
        int ans=0;
        for(int i=0;i<arr.length-1;i++){
            ans = Math.max(ans,prefixArray[i]+suffixArray[i+1]);
        }
        for(int i:prefixArray){
            System.out.println(i);
        }
    }
}