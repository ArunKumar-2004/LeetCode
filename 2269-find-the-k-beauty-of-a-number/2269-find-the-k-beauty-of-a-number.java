class Solution {
    public int divisorSubstrings(int num, int k) {
        String st=Integer.toString(num);
        int count=0;
        for(int i=0;i<st.length()-k+1;i++){
            String sub=st.substring(i,i+k);
            int p=Integer.parseInt(sub);
            System.out.print(sub+" ");
            if(p!=0 && num%p==0){
                count++;
            }
        }
        return count;
    }
}