class Solution {
    public int[] maxSlidingWindow(int[] arr, int k) {
        int ans[]=new int[arr.length-k+1];
        Deque<Integer> q=new LinkedList<Integer>();
        for(int i=0;i<k;i++){
            while(!q.isEmpty() && arr[i]>=arr[q.peekLast()]){
                q.removeLast();
            }
            q.addLast(i);
        }
        int j=0;
        for(int i=k;i<arr.length;i++){
            ans[j++]=arr[q.peek()];
            while(!q.isEmpty() && q.peek()<=i-k){
                q.removeFirst();
            }
            while(!q.isEmpty() && arr[i]>=arr[q.peekLast()]){
                q.removeLast();
            }
            q.addLast(i);
        }
        ans[j++]=arr[q.peek()];
        return ans;
    }
}