package step0;

public class PatternLecture4 {
    public static void main(String[] args) {
        // int number = 4;
        // int system;
        // for(int i=0;i<number;i++){
        //     system=1;
        //     for(int j=number;j>i+1;j--){
        //         System.out.print(" ");
        //     }
        //     for(int k=0;k<=i;k++){
        //         System.out.print(system++);
        //     }
        //     System.out.println();
        // }

        // Q2

        int number = 6;
        for(int i=number;i>0;i--){
            for(int j=0;j<i;j++){
                System.out.print(i);
            }
            System.out.println();
        }
    }   
}
