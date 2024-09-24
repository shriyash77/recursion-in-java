package recursion;

public class subsequences {
    public static void ss(String str, int index, String newString){
        if(index==str.length()){
            System.out.println(newString);
            return;
        }
        char currChar = str.charAt(index);
       
       ss(str, index+1, newString+currChar);

       ss(str, index+1, newString);
    }
    public static void main(String[] args) {
        String str= "abc";
        ss(str, 0, "");
    }
}
