class Solution {
    public boolean isContains(String words[],int pos){
        for(int i=0;i<words.length;i++){
            if(i!=pos && words[i].contains(words[pos])){
                return true;
            }
        }
        return false;
    }
    public List<String> stringMatching(String[] words) {
        List<String> li=new ArrayList<>();
        for(int i=0;i<words.length;i++){
            if(isContains(words,i)){
                li.add(words[i]);
            }
        }
        return li;
    }
}