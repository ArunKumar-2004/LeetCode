class Solution {
    List<Integer> li = new ArrayList<>();
    public List<Integer> sequentialDigits(int low, int high) {
        for (int digit = 1; digit <= 9; digit++) {
            generateSequentialDigits(low, high, digit);
        }
        Collections.sort(li);
        return li;
    }
    private void generateSequentialDigits(int low, int high, int startDigit) {
        int num = startDigit;
        int nextDigit = startDigit + 1;
        while (num <= high && nextDigit <= 9) {
            if (num >= low) {
                li.add(num);
            }
             int lastDigit = num % 10;
            if (lastDigit < 9) {
                num = num * 10 + (lastDigit + 1);
            } else {
                break;
            }
        }
    }
}
