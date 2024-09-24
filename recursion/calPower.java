package recursion;

public class calPower {
    public static int calcpower(int x, int n){
        if(n==0){
            return 1;
        }
        if(x==0){
            return 0;
        }
        int xpowerm1 = calcpower(x, n-1);
        int xpow = x * xpowerm1;
        return xpow;
    }
    public static void main(String[] args) {
        int x = 2, n = 5;
        int ans = calcpower(x, n);
        System.out.println(ans);
    }
}
