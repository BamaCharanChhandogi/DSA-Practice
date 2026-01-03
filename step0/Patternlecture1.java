package step0;
public class Patternlecture1 {
    public static void main(String[] args) {
            
      int number = 5;
      for(int i=0;i<number;i++){
          for(int j=0;j<number;j++){
              System.out.print("0");
          }
          System.out.println();
      }    
     number = 4;
    for(int i=0;i<number;i++){
        for(int j=0;j<=i;j++){
            System.out.print("0");
        }
        System.out.println();
    }
    }
}
