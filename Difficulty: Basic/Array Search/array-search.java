class Solution {

    static int search(int arr[], int x) {

        // Your code here
        int idx = -1;
        for(int i =0;i<arr.length;i++){
            if(arr[i]==x){
                
                return i;
            }
        }return idx;
    }
}
