class Solution {
    public int myAtoi(String s) {
        s=s.trim();
        if(s.length()==0)
            return 0;
        s=s.replaceAll("^\\s+", "");
        int index = 0;
        int sign = 1;
        if (s.charAt(index) == '-' || s.charAt(index) == '+') {
            sign = (s.charAt(index++) == '-') ? -1 : 1;
        }
        long num = 0;
        while (index < s.length() && Character.isDigit(s.charAt(index))) {
            num=num*10+(s.charAt(index++)-'0');
            if(num*sign>Integer.MAX_VALUE){
                return Integer.MAX_VALUE;
            }else if(num*sign<Integer.MIN_VALUE){
                return Integer.MIN_VALUE;
            }
        }
        
        return (int)num*sign;
    }
}