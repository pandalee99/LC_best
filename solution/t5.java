public class t5 {
    public String longestPalindrome(String s) {
        int n=s.length();
        int[][] dp=new int[n][n];
        int max=1;
        int left=0,right=0;
        for(int i=n-1;i>=0;i--){
            dp[i][i]=1;
            for(int j=i+1;j<n;j++){
                if(s.charAt(i)==s.charAt(j)&&dp[i+1][j-1]!=-1){
                    dp[i][j]=dp[i+1][j-1]+2;
                }else{
                    dp[i][j]=-1;
                }
                if(dp[i][j]>max){
                    max=dp[i][j];
                    left=i;
                    right=j;
                }
            }
        }
        return s.substring(left,right+1);
    }
}
