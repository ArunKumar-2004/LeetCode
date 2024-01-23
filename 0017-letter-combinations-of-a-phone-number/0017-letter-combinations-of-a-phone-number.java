class Solution {
    private HashMap<Character,String> map=new HashMap<>();
    private List<String> list=new ArrayList<>();
    public List<String> letterCombinations(String digits) {
        if (digits == null || digits.length() == 0) {
            return list;
        }
        map.put('2',"abc");
        map.put('3',"def");
        map.put('4',"ghi");
        map.put('5',"jkl");
        map.put('6',"mno");
        map.put('7',"pqrs");
        map.put('8',"tuv");
        map.put('9',"wxyz");
        Generate(digits,0,new StringBuilder());
        return list;
    }
    public void Generate(String digits,int start,StringBuilder sb){
        if(start==digits.length()){
            list.add(sb.toString());
            return;
        }
        char ch=digits.charAt(start);
        String comb=map.get(ch);
        if(comb!=null){
            for(int i=0;i<comb.length();i++){
            sb.append(comb.charAt(i));
            Generate(digits,start+1,sb);
            sb.deleteCharAt(sb.length()-1);
        }
        }
        
    }
}