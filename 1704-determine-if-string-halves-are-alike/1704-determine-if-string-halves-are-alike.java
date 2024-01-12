class Solution {
    public boolean isVowel(char ch){
        if (ch=='A' || ch=='E' || ch=='I' || ch=='O' || ch=='U' || ch=='a' || ch=='e' || ch=='i' || ch=='o' || ch=='u') {
                return true;
            }
        return false;
    }
    public boolean halvesAreAlike(String s) {
        if(s.length()==0){
            return false;
        }
        String sub1=s.substring(0,s.length()/2);
        String sub2=s.substring(s.length()/2);
        int count[]={0,0};
        for(int i=0;i<sub1.length();i++){
            char ch=sub1.charAt(i);
            if (isVowel(ch)) {
                count[0]++;
            }
            char ch1=sub2.charAt(i);
            if (isVowel(ch1)) {
                count[1]++;
            }
        }
        return count[0]==count[1];
    }
}