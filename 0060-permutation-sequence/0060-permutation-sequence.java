class Solution {
    ArrayList<String> result = new ArrayList<>();
    public String getPermutation(int n, int k) {
        String res = "";
        for (int i = 1; i <= n; i++) {
            res = res + i;
        }
        generatePermutations(res.toCharArray(), 0);
        Collections.sort(result);
        return result.get(k-1);
    }
    public void generatePermutations(char[] chars, int index) {
        if (index == chars.length - 1) {
            result.add(new String(chars));
        } else {
            for (int i = index; i < chars.length; i++) {
                char temp = chars[index];
                chars[index] = chars[i];
                chars[i] = temp;
                generatePermutations(chars, index + 1);
                temp = chars[index];
                chars[index] = chars[i];
                chars[i] = temp;
            }
        }
    }
}