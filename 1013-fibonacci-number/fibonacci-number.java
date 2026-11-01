class Solution {
    public int fibSeq(int n , int[]dp) {
        if(n<=1) return n ;
        if(dp[n] !=0) return dp[n];
        dp[n] = fibSeq(n-1,dp)+fibSeq(n-2,dp);
        return dp[n];
    }
    public int fib(int n){
        int [] dp =  new int[n+1];
        return fibSeq(n,dp);
    }
}