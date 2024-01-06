class Solution {
    public int divisorSubstrings(int num, int k) {
        String st=Integer.toString(num);
        String s=st.substring(0,k);
        int count=0;
        if(num%Integer.parseInt(s)==0){
            count++;
        }
        for(int i=1;i<st.length()-k+1;i++){
            String sub=st.substring(i,i+k);
            if(Integer.parseInt(sub)==0){
                continue;
            }
            if(num%(Integer.parseInt(sub))==0){
                count++;
            }
        }
        return count;
    }
}