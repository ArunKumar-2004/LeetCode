class Solution {
    public int maxArea(int[] height) {
        int start=0,end=height.length-1;
        int min=Integer.MAX_VALUE;
        int max=0;
        while(start<end){
            min=Math.min(height[start],height[end]);
            max=Math.max(max,(end-start)*min);
            if(height[start]<height[end]){
                min=Math.max(min,(end-start)*height[start]);
                start++;
            }else{
                min=Math.max(min,(end-start)*height[end]);
                end--;
            }
        }
        return max;
    }
}