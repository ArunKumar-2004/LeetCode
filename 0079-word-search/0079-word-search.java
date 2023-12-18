class Solution {
    public boolean exist(char[][] board, String word) {
        for(int i = 0; i < board.length; i++){
            for(int j = 0; j < board[i].length; j++){
                if(word.charAt(0) == board[i][j]) {
                    if(helper(i, j, 0, word, board)) return true;
                }
            }
        }

        return false;
    }

    private boolean helper(int i, int j, int s, String st, char[][] ch){
        if(i < 0 || j < 0 || i >= ch.length || j >= ch[i].length) return false;
        if(st.charAt(s) != ch[i][j]) return false;
        if(s == st.length() - 1 && st.charAt(s) == ch[i][j]) return true;

        char c = ch[i][j];
        ch[i][j] = '_';
        boolean l1 = helper(i + 1, j, s + 1, st, ch);
        boolean l2 = helper(i - 1, j, s + 1, st, ch);
        boolean l3 = helper(i, j + 1, s + 1, st, ch);
        boolean l4 = helper(i, j - 1, s + 1, st, ch);
        ch[i][j] = c;

        return l1 || l2 || l3 || l4;
    }
}