/**
  Given a range [m, n] where 0 <= m <= n <= 2147483647, 
  return the bitwise AND of all numbers in this range, inclusive.
**/
class Solution {
    public int rangeBitwiseAnd(int m, int n) {
     
        while (n > m)
            n &= n - 1;
        return m & n;
    }
}
