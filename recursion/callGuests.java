package recursion;
import java.util.*;

public class callGuests {
    


    public static int cG(int n){
        if(n <= 1){
            return 1;
        }
    
        //single
        int way1 = cG(n-1);

        //pair
        int way2 = (n-1) * cG(n-2);

        return way1 + way2;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        System.out.println(cG(n));
    }
}

    

