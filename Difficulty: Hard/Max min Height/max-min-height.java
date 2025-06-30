class Solution {
    public static boolean isPossible(int arr[],int k,int w,int targetHeight){
            int n = arr.length;
            int [] water = new int[n+1];
            int daysUsed = 0;
            int currWater = 0;
            
            for(int i=0;i<n;i++){
                currWater+=water[i];
                int currHeight = arr[i]+currWater;
                if(currHeight<=targetHeight){
                    int need = targetHeight-currHeight;
                    daysUsed+=need;
                    if(daysUsed>k){
                        return false;
                    }
                    
                    currWater+=need;
                    water[i]+=need;
                    if(i+w<n){
                        water[i+w]-=need;
                    }
                }
            }return true;
        }
    public int maxMinHeight(int[] arr, int k, int w) {
        // code here
        int low = Integer.MAX_VALUE;
        for(int num : arr){
            low = Math.min(low,num);
            
        }
        
        int high = low+k;
        
        int result = 0;
        while(low<=high){
            int mid = (low+high)/2;
            if(isPossible(arr,k,w,mid)){
                result=mid;
                low = mid+1;
            }else{
                high = mid-1;
            }
        }
        
        return result;
    }
}