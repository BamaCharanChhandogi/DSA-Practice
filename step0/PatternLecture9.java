package step0;
import java.util.*;
public class PatternLecture9 {
    public static void main(String[] args) {
        int number  = 4;
        List<Integer> ls  = new ArrayList<Integer>();
        for(int i = 0;i<number;i++){
            ls.add(2 * i +1);
        }

        for(int i=0;i<number;i++){
            for(int j=0;j<number;j++){
                System.out.print(ls.get((i+j) % number) + " ");
            }
            System.out.println();
        }
    }
}
