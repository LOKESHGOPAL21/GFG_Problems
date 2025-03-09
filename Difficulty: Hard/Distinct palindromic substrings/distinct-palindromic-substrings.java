//{ Driver Code Starts
//Initial Template for Java
import java.io.*;
import java.util.*; 
class GFG{
    public static void main(String args[]) throws IOException { 
        BufferedReader read = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(read.readLine());
        while(t-- > 0){
            String str = read.readLine().trim(); 
            Solution obj = new Solution();
            int ans = obj.palindromeSubStrs(str);
            System.out.println(ans);
        
System.out.println("~");
}
    }
}
// } Driver Code Ends


//User function Template for Java

class Solution 
{ 
    int palindromeSubStrs(String str) { 
        // code here 
        HashSet<String> set = new HashSet<>();
    int count = 0;
    
    // Start from i=0 instead of i=1 to include single characters
    for(int i = 0; i < str.length(); i++) {
        // Odd length palindromes
        int low = i;
        int high = i;
        
        while(low >= 0 && high < str.length() && str.charAt(low) == str.charAt(high)) {
            String sub = str.substring(low, high + 1);  // Changed to include both ends
            if(!set.contains(sub)) {
                set.add(sub);
                count++;
            }
            low--;
            high++;
        }
        
        // Even length palindromes
        low = i - 1;
        high = i;
        
        while(low >= 0 && high < str.length() && str.charAt(low) == str.charAt(high)) {
            String sub = str.substring(low, high + 1);  // Changed to include both ends
            if(!set.contains(sub)) {
                set.add(sub);
                count++;
            }
            low--;
            high++;
        }
    }
    return count;
    }
} 