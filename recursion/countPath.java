package recursion;

public class countPath {
    public static int cP(int i, int j, int n, int m){
        if(i == n || j == m){
            return 0;
        }
        if(i == n-1 && j == m-1){
            return 1;
        }
        //move downwards
        int downPaths = cP(i+1, j, n, m);

        //move right
        int rightPaths = cP(i, j+1, n, m);
        return downPaths + rightPaths;
    }
    public static void main(String[] args) {
        int n = 3;
        int m = 4;
        int totalPath = cP(0, 0, n, m);
        System.out.println(totalPath);
    }
}
