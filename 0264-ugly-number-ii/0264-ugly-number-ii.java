class Solution {
    public int nthUglyNumber(int n) {
        TreeSet<Long> set = new TreeSet<>();
        set.add((long)1);
        int count = 0;
        long temp = 1;
        while (count != n) {
            long val = set.pollFirst();
            temp = val;
            ++count;
            set.add(2 * val);
            set.add(3 * val);
            set.add(5 * val);
        }
        return (int)temp;
    }
}
