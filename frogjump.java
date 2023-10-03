import java.util.*;
public class frogjump {
    public static int jump(int arr[],int n){
        int dp[]=new int[n+1];
      //  Arrays.fill(dp,-1);
      return find1(arr, n-1);
    }
    //tabulation
    public static int find2(int arr[],int n, int dp[]){
        dp[0]=0;
        for(int i=1;i<n+1;i++){
                int ff=dp[i-1]+Math.abs(arr[i]-arr[i-1]);
            int ss=0;
            if(i>1) ss=dp[i-2]+ Math.abs(arr[i-2]-arr[i]);
             dp[i]=Math.min(ff,ss);
        }
        return dp[n];
    }
    //memonization 
    public static int find(int arr[],int n ,int dp[]){
          if(n==0) return 0;
          if(dp[n]!=-1){
            return dp[n];
          }
           int left=find(arr,n-1 ,dp)+ Math.abs(arr[n]-arr[n-1]);
             int right=0;
             if(n>1) right=find(arr,n-2,dp)+Math.abs(arr[n]-arr[n-2]);
               return dp[n] = Math.min(left,right);
    }
public static int find1(int arr[],int n){
  if(n==0) return 0;
  int left=find1(arr,n-1)+ Math.abs(arr[n]-arr[n-1]);
int right= Integer.MAX_VALUE;
if(n>1)
  right=find1(arr ,n-2)+ Math.abs(arr[n]-arr[n-2]);
  return Math.min(left,right);
}
    public static void main(String[] args) {
        int arr[]={30,10,60,10,60,50};
        int n=arr.length;
        System.out.print(jump(arr,n)) ;
    }
}

