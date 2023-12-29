class Solution {
    public String convert(String s, int n) {
        if(n==1)
             return s;

        StringBuilder res = new StringBuilder();
        int t = (n-1)*2;

        for(int i=0; i<n ; i++){
            int t1 = t-2*i, t2 = t-t1;
            if(t1 == 0)  t1 = t2;
            if(t2 == 0)  t2 = t1;
            int target = i;
            boolean flag = true;

            while(target<s.length()){
                    res.append(s.charAt(target));
                    if(flag)
                        target+=t1;
                    else
                        target+=t2;
                    flag = !flag;
            }

        }
        return res.toString();
    }
}