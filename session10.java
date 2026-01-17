public class session10 {
    public static void main(String[] args) {
        int sum = 0;
        int t =0;
        int n = 5;
        int b[] = {-2,1,-3,4,-1,2,1,-5,4,5};
        int p1[] = new int[n];
        for(int i=0;i<n;i++){
     sum = 0;
     t = 0 ;
     for(int j=i;j>=0;j--){  
          sum = sum + b[j] ;
          //sum = sum(j…….i)
          t = Math.max(t,sum) ;
      }
      p1[i]=t;
}

    for(int i:p1){
        System.out.println(i);
    }
    }
}
