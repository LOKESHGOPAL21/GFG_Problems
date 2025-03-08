//{ Driver Code Starts
// Initial Template for Java

import java.io.*;
import java.util.*;

class GFG {
    public static void main(String args[]) throws IOException {
        BufferedReader read = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(read.readLine());
        while (t-- > 0) {
            String S = read.readLine();

            Solution ob = new Solution();
            System.out.println(ob.longestPalindrome(S));
            System.out.println("~");
        }
    }
}

// } Driver Code Ends



class Solution {
    static String longestPalindrome(String s) {
        // code here
        String lps = "";
        
        if(s.length()<=1){
            return s;
        }
        
        for(int i=1;i<s.length();i++){
            int low = i;
            int high = i;
            
            while(s.charAt(low)==s.charAt(high)){
                low--;
                high++;
                
                if(low==-1 || high == s.length()){
                    break;
                }
            }
            
            String palindrome = s.substring(low+1,high);
            if(palindrome.length()>lps.length()){
                lps = palindrome;
            }
            
            low = i-1;
            high = i;
            
            while(s.charAt(low)==s.charAt(high)){
                low--;
                high++;
                
                if(low==-1 || high == s.length()){
                    break;
                }
            }
            
            palindrome = s.substring(low+1,high);
            if(palindrome.length()>lps.length()){
                lps = palindrome;
            }
            
        }
        
        return lps;
        
    }
}