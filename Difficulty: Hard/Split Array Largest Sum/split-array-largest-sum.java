class Solution {
    public static int countPartitions(int [] a,int maxSum){
        int partitions = 1;
        int subarraySum = 0;
        int n = a.length;
        
        for(int i =0;i<n;i++){
            if(subarraySum+a[i]<=maxSum){
                subarraySum+=a[i];
            }else{
                partitions++;
                subarraySum = a[i];
            }
        }
        return partitions;
    }
    public int splitArray(int[] arr, int k) {
        // code here
        int high = 0;
        int low = arr[0];
        
        for(int j =0;j<arr.length;j++){
            low = Math.max(low,arr[j]);
            high+=arr[j];
        }
        
        while(low<=high){
            int mid = (low+high)/2;
            
            int partitions = countPartitions(arr,mid);
            
            if(partitions>k){
                low=mid+1;
            }else{
                high = mid-1;
            }
        } return low;
        
    }
};