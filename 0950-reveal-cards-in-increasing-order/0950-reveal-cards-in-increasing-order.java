class Solution {
    public void swap(List<Integer> li){
        int temp=li.get(li.size()-1);
        for(int i=li.size()-1;i>=1;i--){
            li.set(i,li.get(i-1));
        }
        li.set(0,temp);
    }
    public int[] deckRevealedIncreasing(int[] deck) {
        Arrays.sort(deck);
        int ans[]=new int[deck.length];
        List<Integer> li=new ArrayList<>();
        int k=deck.length-1;
        li.add(deck[k--]);
        for(int i=1;i<deck.length;i++){
            swap(li);
            li.add(0,deck[k--]);
        }
        for(int j=0;j<li.size();j++){
            ans[j]=li.get(j);
        }
        return ans;
    }
}