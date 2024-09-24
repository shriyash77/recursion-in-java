package recursion;

public class printSumFirstN {
    public static void printSumFirstNat(int i, int n, int s){
        if(i==n){
            s += i;
            System.out.println(s);
            return;
        }
        s += i;
        printSumFirstNat(i+1 , n , s);
    }
    
    public static void main(String[] args) {
        int i = 0;
        int n = 5;
        int s = 0;
        printSumFirstNat(i, n, s);
    }

    
}
