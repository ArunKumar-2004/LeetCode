import java.util.ArrayList;
import java.util.List;

class Solution {
    public List<List<Integer>> findMatrix(int[] nums) {
        List<List<Integer>> li = new ArrayList<>();
        List<Integer> list = new ArrayList<>();
        for(int num : nums){
            list.add(num);
        }
        int count=0;
        while(list.size()>count){
            List<Integer> li1 = new ArrayList<>();
            List<Integer> rem = new ArrayList<>();
            for(int i = 0; i < list.size(); i++){
                if(!li1.contains(list.get(i)) && list.get(i)!=-1){
                    li1.add(list.get(i));
                    list.set(i,-1);
                    count++;
                }
            }
            li.add(li1);
        }
        return li;
    }
}
