import java.util.*;
public class stairs{
    //memonaization
public static int climbstairs(int n ,int dp[]){
if(n==0) return 1;
if(n==-1) return 0;
if(dp[n]!=-1){
    return dp[n];
}
dp[n]=climbstairs(n-1,dp)+climbstairs(n-2,dp);
return dp[n];
}
//Tabulation
public static int stairs1(int n){
    int dp[]=new int[n+1];
    dp[0]=1;
    for(int i=1;i<n+1;i++){
        if(i==1){
            dp[i]=dp[i-1];
        }
        else{
            dp[i]=dp[i-1]+dp[i-2];
        }
    }
    return dp[n];
}
public static void main(String[] args) {
    int n=5;
    int dp[]=new int[n+1];
    Arrays.fill(dp,-1);
   System.out.println( climbstairs(n,dp));
      System.out.println( stairs1(n));
}
}