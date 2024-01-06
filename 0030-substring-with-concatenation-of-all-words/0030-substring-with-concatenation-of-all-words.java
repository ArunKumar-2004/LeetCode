class Solution {
    public List<Integer> findSubstring(String s, String[] words) {
       if(s.length() == 0 || s == null || words == null || words.length == 0)
           return new ArrayList<>();
       Map<String, Integer> counts = new HashMap<>();
       for(String word : words)
           counts.put(word, counts.getOrDefault(word, 0) + 1);
       List<Integer> res = new ArrayList<>();
       int slen = words[0].length();
       int len = words.length;
       int n = s.length();
       for(int i = 0; i < n - slen * len + 1; i++){
           String substr = s.substring(i, i + slen * len);
           HashMap<String,Integer> seen = new HashMap<>();
           for(int j = 0; j < substr.length(); j += slen){
               String word = substr.substring(j, j + slen);
               seen.put(word, seen.getOrDefault(word, 0) + 1);
           }
           if(seen.equals(counts))
               res.add(i);
       }
       return res;
    }
}