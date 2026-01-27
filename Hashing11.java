import java.util.*;

public class Hashing11 {
    public static void main(String[] args) {
        int n = 5;
        int arr[] = {4,5,5,2,4};
        TreeMap<Integer,Integer> hp = new TreeMap<>(Collections.reverseOrder());
        for(int i:arr){
           hp.put(i,hp.getOrDefault(i, 0)+1);
        }
        List<Map.Entry<Integer,Integer>> ls = new ArrayList<>(hp.entrySet());
        int count=0;
        for(int i=0;i<hp.size()-1;i++){
            ls.get(i+1).setValue(ls.get(i+1).getValue() +ls.get(i).getValue());
            count+=ls.get(i).getValue();
            ls.get(i).setValue(0);
        }
        System.out.println(count);
    }
}
