class Solution:
    def maxWater(self, arr):
        # code here
        l,r=0,len(arr)-1
        res=0
        while(l<r):
            area =(r-l)*min(arr[l],arr[r])
            res = max(area,res)
            if(arr[l]>arr[r]) : r-=1
            elif(arr[l]<=arr[r]): l+=1
        return res