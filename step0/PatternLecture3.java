package step0;  

public class PatternLecture3 {
    public static void main(String[] args) {
        // int number = 6;
        // int index = 65;
        // for(int i=0;i<number;i++){
        //     int index2 = i+index;
        //     for(int j=0;j<=i;j++){
        //         System.out.print((char)(index2)+" ");
        //         index2++;
        //     }
        //     System.out.println();
        // }


        // Q2

        int number = 8;
        int index = 65+(number-1);
        for(int i = number;i>0;i--){
            int index2 = index-(number-i);
            for(int j=number;j>=i;j--){
                System.out.print((char)index2+" ");
                index2++;

            }
            System.out.println();
        }
    }
}
