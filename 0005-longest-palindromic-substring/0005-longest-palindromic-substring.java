class Solution {
    public String longestPalindrome(String str) {
        int n = str.length();
		boolean arr[][] = new boolean[n + 1][n + 1];
		for (int i = 0; i < n; i++) {
			arr[i][i] = true;
		}
		for (int i = 0; i < n - 1; i++) {
			if (str.charAt(i) == str.charAt(i + 1)) {
				arr[i][i + 1] = true;
			}
		}
		for (int i = 3; i <= n; i++) {
			for (int j = 0; j <= n - i; j++) {
				if (str.charAt(j) == str.charAt(j + i - 1) && arr[j + 1][j + i - 2] ) {
					arr[j][j + i - 1] = true;
				}
			}
		}
        int maxLength = 0;
        int start = 0;
        for (int i = 0; i < n; i++) {
            for (int j = i; j < n; j++) {
                if (arr[i][j] && j - i + 1 > maxLength) {
                    maxLength = j - i + 1;
                    start = i;
                }
            }
        }
        return str.substring(start, start + maxLength);
    }
}