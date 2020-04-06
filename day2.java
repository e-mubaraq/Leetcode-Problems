class Solution {
    HashSet<Integer> squares = new HashSet<Integer>();
    public boolean isHappy(int n) {
        int temp = 0;
        int sumOfSquare = 0;
        Integer s;
        
        while (n != 0) {
            temp = n % 10;
            sumOfSquare += Math.pow(temp, 2);
            
            n = n / 10;
        }
        
        s = Integer.valueOf(sumOfSquare);
        
        if (sumOfSquare == 1) {
            squares.clear();
            return true;
        }
        else if (squares.contains(s)) {
            return false;
        }
        else {
            squares.add(s);
            return isHappy(sumOfSquare);
        }
        
    }
}
