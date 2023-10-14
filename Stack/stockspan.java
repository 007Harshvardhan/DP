package Stack;
import java.util.*;
public class stockspan {
    public static void spancheck(int stock[]){
        Stack<Integer> s=new Stack<>();
        int ans[]=new int[stock.length];
        ans[0]=1;
        s.push(0);
        for(int i=1;i<stock.length;i++){
            while(!s.isEmpty() && stock[s.peek()]<stock[i]){
               s.pop();
            }
            if(s.isEmpty()){
                ans[i]=i+1;
            }
            else{
            ans[i]=i-s.peek();
             }
             s.push(i);
            }
            for(int i=0;i<ans.length;i++){
                System.out.print(" "+ ans[i]);
            }
    }
  public static void main(String[] args) {
    int stocks[]={100  ,80 ,60 ,70,60,85 ,100};
    spancheck(stocks);
  }  
}
