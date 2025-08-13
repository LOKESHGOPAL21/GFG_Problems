import java.util.*;
class Solution {
    public ArrayList<Integer> twoSum(int[] arr, int target) {
        // code here
        int l =0,r=arr.length-1;
        while(l<r){
            int sum = arr[l]+arr[r];
            if(sum>target) r--;
            else if(sum<target) l++;
            else return new ArrayList<>(Arrays.asList(l+1,r+1));
        }
        return new ArrayList<>(Arrays.asList(-1,-1));
    }
}