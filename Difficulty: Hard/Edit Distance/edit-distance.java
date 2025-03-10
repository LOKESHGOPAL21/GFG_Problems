//{ Driver Code Starts
import java.io.*;
import java.lang.*;
import java.util.*;

class GFG {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int T = Integer.parseInt(br.readLine().trim());
        while (T-- > 0) {
            String s1 = br.readLine();
            String s2 = br.readLine();

            Solution ob = new Solution();
            int ans = ob.editDistance(s1, s2);
            System.out.println(ans);

            System.out.println("~");
        }
    }
}

// } Driver Code Ends


class Solution {
    public static int editDistanceUtil(String s1,String s2, int i,int j,int [][] dp){
        if(i<0){
            return j+1;
        }if(j<0){
            return i+1;
        }
        
        if(dp[i][j]!=-1){
            return dp[i][j];
        }
        
        if(s1.charAt(i)  == s2.charAt(j)){
            return dp[i][j] = editDistanceUtil(s1,s2,i-1,j-1,dp);
        }
        else{
            return dp[i][j] = 1+Math.min(editDistanceUtil(s1,s2,i-1,j-1,dp),
                                Math.min( editDistanceUtil(s1,s2,i-1,j,dp),
                                        editDistanceUtil(s1,s2,i,j-1,dp))
                                );
        }
    }
    public int editDistance(String s1, String s2) {
        // Code here
        int n = s1.length();
        int m = s2.length();
        
        int [][] dp = new int[n][m];
        for(int [] row : dp){
            Arrays.fill(row,-1);
        }
        
        return editDistanceUtil(s1,s2,n-1,m-1,dp);
    }
}