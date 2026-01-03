package step0;

public class PatternLecture8 {
    public static void main(String[] args) {
        int number = 5;
        int sum;
        for(int i=1;i<=number;i++){
            sum=0;
            for(int j=1;j<=i;j++){
                System.out.print(j);
                if(i!=j) System.out.print("+");
                sum+=j;
            }
            System.out.print("="+sum);
            System.out.println();
        }
    }
}
