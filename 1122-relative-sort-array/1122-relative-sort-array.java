class Solution {
    public int[] relativeSortArray(int[] arr1, int[] arr2) {
        HashMap<Integer,Integer> map=new HashMap<>();
        for(int i:arr1){
            map.put(i,map.getOrDefault(i,0)+1);
        }
        int result[]=new int[arr1.length];
        int p=0;
        for (int i : arr2) {
            if (map.containsKey(i)) {
                for (int k = 0; k < map.get(i); k++) {
                    result[p++] = i;
                }
                map.remove(i);
            }
        }
        List<Integer> li=new ArrayList<>();
        for(int i:map.keySet()){
            for(int j=0;j<map.get(i);j++)
                li.add(i);
        }
        Collections.sort(li);
        for(int i=0;i<li.size();i++){
            result[p++] = li.get(i);
            System.out.print(li.get(i)+" ");
        }
        return result;
    }
}