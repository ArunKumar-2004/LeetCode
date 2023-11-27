class Solution {
    public static void Crack(int arr[],int start,int end,List<List<Integer>> res)
    {
        int temp;
        if(start==end)
        {
            List<Integer> array=new ArrayList<>();
            for(int i=0;i<arr.length;i++)
            {
                array.add(arr[i]);
            }
            res.add(array);
            return;
        }
        else
        {
            for(int i=start;i<=end;i++)
            {
                temp=arr[start];
                arr[start]=arr[i];
                arr[i]=temp;
                Crack(arr,start+1,end,res);
                temp=arr[start];
                arr[start]=arr[i];
                arr[i]=temp;
            }
        }
    }
    public List<List<Integer>> permute(int[] nums) {
        List<List<Integer>> res=new ArrayList<>();
        int len=nums.length-1;
        Crack(nums,0,len,res);
        return res;
    }
}
