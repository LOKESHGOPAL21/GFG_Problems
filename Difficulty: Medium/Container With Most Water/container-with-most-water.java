class Solution {
    public int maxWater(int arr[]) {
        // Code Here
        int l=0,r=arr.length-1;
        int res = 0;
        while(l<r){
            int area = (r-l)*Math.min(arr[r],arr[l]);
            res = Math.max(area,res);
            
            if(arr[r]<arr[l]) r--;
            else if(arr[l]<arr[r]) l++;
            else r--;
        }return res;
    }
}