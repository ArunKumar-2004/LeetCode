public class Solution {
    public double myPow(double x, int n) {
        if (n == 0) {
            return 1;
        } else if (n > 0) {
            return fastPow(x, n);
        } else {
            return 1 / fastPow(x, -n);
        }
    }

    private double fastPow(double x, int n) {
    if (n == 0) {
        return 1;
    }
        if(n==1){
            return x;
        }
    double halfPow = fastPow(x, n / 2);
    if (n % 2 == 0) {
        return halfPow * halfPow;
    } else {
        return halfPow * halfPow * x;
    }
}

}
