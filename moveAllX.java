package recursion;

public class moveAllX {
    public static void moveA(String str, int index, int count, String newStr){
        if(index == str.length()){
            for(int i=0; i<count; i++){
                newStr += 'x';
            }
            System.out.println(newStr); 
            System.out.println(count);
            return;
        }
        char currChar = str.charAt(index);
        if(currChar == 'x'){
            count++;
            moveA(str, index+1, count, newStr);
        } else{
            newStr += currChar;
            moveA(str, index+1, count, newStr);
        }
    }
    public static void main(String[] args) {
        String str = "axbxcdxxgxdfx";
        moveA(str,0,0,"");
    }
}
