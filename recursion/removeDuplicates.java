package recursion;

public class removeDuplicates {
    public static boolean[] map = new boolean[26];
    public static void rD(String str, int index, String newString){
        if(index == str.length()){
           System.out.println(newString);
            return;
        }
        char currChar = str.charAt(index);
        if(map[currChar - 'a']){
            rD(str, index+1, newString);
        } else{
            newString += currChar;
            map[currChar - 'a']=true;
            rD(str, index+1, newString);
        }
    }
    public static void main(String[] args) {
        String str = "abbaccd";
        rD(str, 0, "");
    }
}
