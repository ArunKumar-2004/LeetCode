import java.util.HashMap;
class Solution {
    public int minOperations(int[] nums) {
        HashMap<Integer,Integer> map=new HashMap<>();
        for(int i:nums){
            map.put(i,map.getOrDefault(i,0)+1);
        }
        int res=0;
        for(int i:map.keySet()){
            int val=map.get(i);
            if(val<2){
                return -1;
            }
            while(val>0){
                if(val%3==0){
                    val-=3;
                    res++;
                }else{
                    val-=2;
                    res++;
                }
            }
        }
        return res;
    }
}