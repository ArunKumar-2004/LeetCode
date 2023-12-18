class Solution {
    Map<String, Boolean> memo = new HashMap<>();

	public boolean isMatch(String s, String p) {
		return dfs(s, p, 0, 0);
	}

	private boolean dfs(String s, String p, int i, int j) {
		String key = i + "_" + j;

		if (memo.containsKey(key))
			return memo.get(key);

		if (i >= s.length() && j >= p.length())
			return true;

		if (j >= p.length())
			return false;

		boolean isMatch = i < s.length() && (s.charAt(i) == p.charAt(j) || p.charAt(j) == '.');

		if (j + 1 < p.length() && p.charAt(j + 1) == '*') {
			memo.put(key, dfs(s, p, i, j + 2) || (isMatch && dfs(s, p, i + 1, j)));
			return memo.get(key);
		}

		if (isMatch) {
			memo.put(key, dfs(s, p, i + 1, j + 1));
			return memo.get(key);
		}

		memo.put(key, false);

		return false;
	}
}