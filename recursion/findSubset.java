package recursion;
import java.util.*;

public class findSubset {
    public static void printSubset( ArrayList<Integer> subset){
        for(int i=0; i<subset.size(); i++){
            System.out.print(subset.get(i)+"");
        }
        System.out.println();
    }
    public static void fS(int n, ArrayList<Integer> subset){
        if(n == 0){
            printSubset(subset);
            return;
        }
        //add hoga
        subset.add(n);
        fS(n-1, subset);

        //add nahi hoga
        subset.remove(subset.size()-1);
        fS(n-1, subset);
    }
   public static void main(String[] args) {
    int n = 3;
    ArrayList<Integer> subset = new ArrayList<>();
    fS(n, subset);
   } 
}
