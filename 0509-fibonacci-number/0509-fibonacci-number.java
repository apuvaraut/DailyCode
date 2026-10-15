class Solution {
    public int fib(int n) {
if(n<=1){
    return n;
}
int dp[]=new int[n+1];
java.util.Arrays.fill(dp, -1);

return solve(n,dp);
}

public static int solve(int n,int[]dp){
    if(n<=1){
        return n;
    }
    if(dp[n]!= -1){
        return dp[n];
    }
    dp[n]= solve(n-1,dp)+solve(n-2,dp);
    return dp[n];
}
}