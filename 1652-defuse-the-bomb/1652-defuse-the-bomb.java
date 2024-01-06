class Solution {
    public int[] decrypt(int[] code, int k) {
        int n = code.length;
        int[] ans = new int[n];

        if (k > 0) {
            for (int i = 0; i < n; i++) {
                int sum = 0;
                for (int j = i + 1; j <= k + i; j++) {
                    sum += code[j % n];
                }
                ans[i] = sum;
            }
        } else if (k < 0) {
            k = -k;
            for (int i = 0; i < n; i++) {
                int sum = 0;
                for (int j = i + n - 1; j >= i + n - k; j--) {
                    sum += code[(j % n + n) % n]; 
                }
                ans[i] = sum;
            }
        } else {
            for (int i = 0; i < n; i++) {
                ans[i] = 0;
            }
        }

        return ans;
    }
}
