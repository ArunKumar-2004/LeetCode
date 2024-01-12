class Solution {
    public boolean halvesAreAlike(String s) {
        if(s.length()==0){
            return false;
        }
        String sub1=s.substring(0,s.length()/2);
        String sub2=s.substring(s.length()/2);
        int count[]={0,0};
        for(int i=0;i<sub1.length();i++){
            char ch=sub1.charAt(i);
            if (ch == 'A' || ch == 'E' || ch == 'I' || ch == 'O' || ch == 'U' || ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u') {
                count[0]++;
            }
        }
        for(int i=0;i<sub2.length();i++){
            char ch=sub2.charAt(i);
            if (ch == 'A' || ch == 'E' || ch == 'I' || ch == 'O' || ch == 'U' || ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u') {
                count[1]++;
            }
        }
        return count[0]==count[1];
    }
}