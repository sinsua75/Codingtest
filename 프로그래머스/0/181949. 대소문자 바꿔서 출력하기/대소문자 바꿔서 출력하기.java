import java.util.Scanner;

public class Solution {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String a = sc.next();
        char[] ch = a.toCharArray();
        
        
        for(int i = 0; i< ch.length; i++){
            if(Character.isUpperCase(ch[i])){
                char temp = ch[i];
                ch[i] = Character.toLowerCase(temp);
            }
            else{
                char temp = ch[i];
                ch[i] = Character.toUpperCase(temp);
            }
        }
        
        System.out.print(new String(ch));
    }
}