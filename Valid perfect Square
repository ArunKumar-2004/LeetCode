class Solution {
    public boolean isPerfectSquare(int num) {
        int low = 1;
        int heigh = num;
        if(num==1) return true;
       
        while(low<=heigh)
        {
            int mid = low + (heigh-low)/2;
            double val = (num*1.0)/(mid*(1.0));
            if(mid == val) return true;
            else if(mid<val) low = mid + 1;
            else heigh = mid-1;
        }
        return false;
    }
}
