//{ Driver Code Starts
// Initial Template for Java

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Main {

    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int tc = Integer.parseInt(br.readLine());
        while (tc-- > 0) {
            String[] inputLine = br.readLine().split(" ");
            int[] arr = new int[inputLine.length];
            for (int i = 0; i < inputLine.length; i++) {
                arr[i] = Integer.parseInt(inputLine[i]);
            }

            new Solution().pushZerosToEnd(arr);
            int n = arr.length;
            for (int i = 0; i < n; i++) {
                System.out.print(arr[i] + " ");
            }
            System.out.println();

            System.out.println("~");
        }
    }
}
// } Driver Code Ends


// User function Template for Java

class Solution {
    void pushZerosToEnd(int[] arr) {
        // code here
        int p=-1;
        for(int i=0;i<arr.length;i++){
            if(arr[i]==0){
                p=i;
                break;
            }
            
        }
        if(p==-1){
            return;
        }
        int j=p+1;
        while(j<arr.length){
            if(arr[j]!=0){
                int temp = arr[p];
                arr[p]=arr[j];
                arr[j]=temp;
                p++;
            }j++;
        }
    }
}