package Stack;
import java.util.*;
//Company name-> macrosoft,filpkart,adobe,paytm,amazon;
public class Stringrev {
    public static String reverseStr(String str){
        Stack<Character> s=new Stack<>();
        int idx=0;
        while(idx<str.length()){
            s.push(str.charAt(idx));
            idx++;
        }
        StringBuilder sa=new StringBuilder("");
        while(!s.isEmpty()){
            char curr=s.pop();
            sa.append(curr);
        }
        return sa.toString();
    }
    public static void main(String[] args) {
        String str="abcd";
        System.out.println(reverseStr(str));
    }
}
