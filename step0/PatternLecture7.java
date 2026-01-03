package step0;

public class PatternLecture7 {
    public static void main(String[] args) {
        int number  = 4;
        for(int i=0;i<number;i++){
            // space
            for(int k=0;k<i;k++){
                System.out.print(" ");
            }
            // star
            for(int k=0;k<number;k++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
