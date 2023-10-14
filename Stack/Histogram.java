package Stack;
import java.util.*;
public class Histogram {
    public static int largestRectanfle(int height[]){
        Stack<Integer> s=new Stack<>();
        int nsR[]=new int[height.length];
        int nsL[]=new int[height.length]; 
        for(int i=height.length-1;i>=0; i--){
            while(!s.isEmpty() && height[s.peek()]>=height[i]){
                s.pop();
            }
            if(s.isEmpty()){
                nsR[i]=height.length;
            }
            else{
               nsR[i] =s.peek();
            }
            s.push(i);
        }
        for(int i=0;i<height.length;i++){
            while(!s.isEmpty() && height[s.peek()]>=height[i]){
                s.pop();
            }
            if(s.isEmpty()){
                nsL[i]=-1;
            }
            else{
                nsL[i]=s.peek();
            }
            s.push(i);
        }
        int maxarea=0;
        for(int i=0;i<height.length;i++){
            int heigh=height[i];
            int width=nsR[i]-nsL[i]-1;
            int curr=heigh*width;
            maxarea=Math.max(maxarea,curr);
        }
return maxarea;
    }
    public static void main(String[] args) {
        int height[]={2,1,5,6,2,3};
        System.out.println(largestRectanfle(height));
    }
}
