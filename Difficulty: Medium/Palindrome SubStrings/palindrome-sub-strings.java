//{ Driver Code Starts
// Initial Template for Java

import java.io.*;
import java.util.*;

class GfG {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-- > 0) {
            String s = sc.next();

            Solution obj = new Solution();

            System.out.println(obj.countPS(s));

            System.out.println("~");
        }
    }
}
// } Driver Code Ends



class Solution {
    public int countPS(String s) {
        // code here
        int count =0;
        
        for(int i=1;i<s.length();i++){
            int low = i;
            int high = i;
            
            while(s.charAt(low)==s.charAt(high)){
                
                low--;
                high++;
                String sub = s.substring(low+1,high);
                if(sub.length()>=2){
                    // System.out.println(sub);
                    count++;      
                }
                if(low==-1|| high ==s.length()){
                    break;
                }
                
               
            }
            
            
         
            
            low = i-1;
            high = i;
            while(s.charAt(low)==s.charAt(high)){
                
                low--;
                high++;
                String sub = s.substring(low+1,high);
                if(sub.length()>=2){
                    // System.out.println(sub);
                    count++;      
                }
                if(low==-1|| high ==s.length()){
                    break;
                }
                
            }
            
            
            
            
        } return count;
    }
}