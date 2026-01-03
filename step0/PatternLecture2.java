package step0;

public class PatternLecture2 {

    public static void main(String[] args) {

        int number = 6;
        // for (int i = 1; i <= number; i++) {
        //     for (int j = 1; j <= i; j++) {
        //         System.out.print(i + " ");
        //     }
        //     System.out.println();
        // }

        // 2nd question
        number =6;
        int asciiA = 65 + number;

        for(int i=65;i<asciiA;i++){
            for(int j=0;j<=i-65;j++){
                System.out.print((char)i+" ");
            }
            System.out.println();
        }
        

    }
}
