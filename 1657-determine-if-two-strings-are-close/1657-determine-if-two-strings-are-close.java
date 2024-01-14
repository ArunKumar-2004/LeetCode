class Solution {
    public boolean closeStrings(String word1, String word2) {
        if(word1.length()!=word2.length()){
            return false;
        }
        Map<Character,Integer> count1=countOccurrences(word1);
        Map<Character,Integer> count2=countOccurrences(word2);
        if(!count1.keySet().equals(count2.keySet())){
            return false;
        }
        List<Integer> li1=new ArrayList<>(count1.values());
        List<Integer> li2=new ArrayList<>(count2.values());
        Collections.sort(li1);
        Collections.sort(li2);
        return li1.equals(li2);
    }
    public Map<Character,Integer> countOccurrences(String word){
        Map<Character,Integer> count=new HashMap<>();
        for(char c:word.toCharArray()){
            count.put(c, count.getOrDefault(c,0)+1);
        }
        return count;
    }
}