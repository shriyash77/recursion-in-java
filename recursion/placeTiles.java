package recursion;

public class placeTiles {
    public static int pT(int n, int m){
        if(n==m){
            return 2;
        }
        if(n<m){
            return 1;
        }
        //vertically
        int verticallyPlacement = pT(n-m, m);

        //horizontally
        int horizontallyPlacement = pT(n-1, m);
        return verticallyPlacement + horizontallyPlacement;
    }
    public static void main(String[] args) {
        int n = 4, m = 2;
        System.out.println(pT(n, m));
    }
}
