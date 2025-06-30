
class Solution {
    public boolean isSubset(int a[], int b[]) {
        // Your code here
        HashMap<Integer,Integer> map = new HashMap<>();
        
        for(int i=0;i<a.length;i++){
            map.put(a[i],map.getOrDefault(a[i],0)+1);
        }
        
        
        for(int j =0;j<b.length;j++){
            if(!map.containsKey(b[j]) || map.get(b[j])==0){
                return false;
            }else{
                map.put(b[j],map.get(b[j])-1);
                
            }
        }
        
        return true;
    }
}
