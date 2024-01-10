class Solution {
    public int numOfSubarrays(int[] arr, int k, int threshold) {
        int count=0,sum=0;
        for(int i=0;i<k;i++){
            sum+=arr[i];
        }
        if(sum/k>=threshold){
            count++;
        }
        for(int i=k;i<arr.length;i++){
            sum+=arr[i]-arr[i-k];
            if(sum/k>=threshold){
                count++;
            }
        }
        return count;
    }
}