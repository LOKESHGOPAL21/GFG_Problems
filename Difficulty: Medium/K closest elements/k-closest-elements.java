class Solution {
    int[] printKClosest(int[] arr, int k, int x) {
        // code here
        Queue<Integer> pq = new PriorityQueue<>(
                (a,b)->Math.abs(a-x)!=Math.abs(b-x) ? Math.abs(b-x)-Math.abs(a-x):a-b
            );
            
        for(int i : arr){
            if(i!=x){
                pq.add(i);
            }
            if(pq.size()>k){
                pq.poll();
            }
        }
        
        int ans[] = new int[k];
        int i =k-1;
        while(i>=0){
            ans[i]=pq.poll();
            i--;
        }
        return ans;
    }
}
