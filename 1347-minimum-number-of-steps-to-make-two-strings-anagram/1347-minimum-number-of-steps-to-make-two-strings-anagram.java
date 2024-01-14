class Solution {
    public int minSteps(String s, String t) {
        HashMap<Character,Integer> map=new HashMap<>();
        for(char ch:s.toCharArray()){
            map.put(ch,map.getOrDefault(ch,0)+1);
        }
        int count=0;
        for(char ch:t.toCharArray()){
            if(!map.containsKey(ch)){
                count++;
            }else{ 
                if(map.get(ch)<=0)
                    count++;
                map.put(ch,map.get(ch)-1);
            }
        }
        return count;
    }
}