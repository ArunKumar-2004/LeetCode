class Solution {
    public int numDecodings(String s) {
    if(s.length()==0 || s.startsWith("0")) return 0;
    char[] cs = s.toCharArray();
    int[] set = new int[2];
    int latest0 = -1;
    if(cs[cs.length-1]=='0'){
        set[1] = 1;
        latest0 = cs.length-1;
    }else{
        set[0] = 1;
    }
    for(int i=cs.length-2;i>=0;i--){
        if(cs[i+1]=='0' && (cs[i]>='3' || cs[i]=='0')){
            return 0;
        }
        if(cs[i]=='0'){
            set[1] += set[0];
            set[0] = 0;
            latest0 = i;
            continue;
        }
        if(i==latest0-1){
            continue;
        }
        if(i==latest0-2 || cs[i]>='3' || cs[i]=='2' && cs[i+1]>'6'){
            set[0] += set[1];
            set[1] = 0;
            continue;
        }
        int tmp = set[0];
        set[0] += set[1];
        set[1] = tmp;
    }
    return set[0] + set[1];
}
}