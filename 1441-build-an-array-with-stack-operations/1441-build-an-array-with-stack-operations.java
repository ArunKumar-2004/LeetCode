class Solution {
    public List<String> buildArray(int[] target, int n) {
        String[] res={"Push","Pop"};
        List<String> li=new ArrayList<>();
        int a=0;
        for(int i=1;i<=n;i++){
            if(a==target.length){
                break;
            }
            if(i==target[a++]){
                li.add(res[0]);
            }else{
                li.add(res[0]);
                li.add(res[1]);
                a--;
            }
        }
        return li;
    }
}