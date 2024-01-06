class Solution {
    public int[] decrypt(int[] code, int k) {
        int ans[]=new int[code.length];
        if(k>0){
            for(int i=0;i<code.length;i++){
            int sum=0;
            for(int j=i+1;j<=k+i;j++){
                sum+=code[j%code.length];
            }
            ans[i]=sum;
        }
        }else if(k<0){
            k=k*-1;
            for(int i=0;i<code.length;i++){
            int sum=0;
            for(int j=i+code.length-1;j>=i+code.length-k;j--){
                sum+=code[(j%code.length+code.length)%code.length];
            }
            ans[i]=sum;
        }
        }else{
            for(int i=0;i<code.length;i++){
                ans[i]=0;
            }
        }
        
        return ans;
    }
}