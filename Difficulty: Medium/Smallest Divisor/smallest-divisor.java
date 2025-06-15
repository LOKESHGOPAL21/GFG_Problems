class Solution {
    static int chec(int [] arr, int mid){
        int sum = 0;
        
        for(int i : arr){
            sum += i%mid==0 ? i/mid : i/mid+1;
            
        }
        
        return sum;
    }
    int smallestDivisor(int[] arr, int k) {
        // Code here
        if(k<arr.length){
            return 0;
        }
        
        int low = 1;
        int high = Arrays.stream(arr).max().getAsInt();
        
        
        int ans =0;
        while(low<=high){
            int mid = (low+high)/2;
            if(chec(arr,mid)<=k){
                ans =  mid;
                high = mid-1;
            }
            else{
                low = mid+1;
            }
        }return ans;
    }
}