class Solution {
    HashMap<String,Boolean> dp=new HashMap<>();
    Set<String> set;
    public boolean wordBreak(String s, List<String> wordDict) {
        set=new HashSet<>(wordDict);
        return Helper(s,set);
    }
    public boolean Helper(String s,Set<String> set){
        if(s.length()==0){
            return true;
        }
        if(dp.containsKey(s)){
            return false;
        }
        for(int i=0;i<s.length();i++){
            String sub=s.substring(0,i+1);
            if(set.contains(sub)){
                if(Helper(s.substring(i+1),set)){
                    dp.put(s,true);
                    return true;
                }
            }
        }
        dp.put(s,false);
        return false;
    }
}