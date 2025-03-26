//{ Driver Code Starts
// Initial Template for Java
import java.io.*;
import java.util.*;
import java.util.stream.Collectors;

public class Main {

    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        int t = Integer.parseInt(sc.nextLine());
        while (t-- > 0) {
            String[] arr1Str = sc.nextLine().split(" ");
            int[] arr = Arrays.stream(arr1Str).mapToInt(Integer::parseInt).toArray();
            Solution ob = new Solution();
            int ans = ob.getSecondLargest(arr);
            System.out.println(ans);

            System.out.println("~");
        }
    }
}

// } Driver Code Ends


// User function Template for Java

class Solution {
    public int getSecondLargest(int[] arr) {
        // Code Here
        int maxi = Integer.MIN_VALUE;
        int sec_maxi = Integer.MIN_VALUE;
        
        for(int i=0;i<arr.length;i++){
            if(arr[i]>maxi){
                sec_maxi=maxi;
                maxi=arr[i];
                
            }else if (arr[i]<maxi && arr[i]>sec_maxi){
                sec_maxi=arr[i];
            }
        }
        
        if(sec_maxi == Integer.MIN_VALUE || sec_maxi == maxi){
            sec_maxi = -1;
        }
        
        return sec_maxi;
    }
}