class Solution {
    public boolean backspaceCompare(String S, String T) {
        int i, j, countT = 0;
        int countS = 0;
        
        i = S.length() - 1;
        j = T.length() - 1;
        
        while(i>= 0 || j >=0) {
            while(i >= 0) {
                if (S.charAt(i) == '#') {
                    countS++;
                    i--;
                }
                else if (countS > 0) {
                    countS--;
                    i--;
                }
                else
                    break;    
            }
            while(j >= 0) {
                if (T.charAt(j) == '#') {
                    countT++;
                    j--;
                }
                else if (countT > 0) {
                    countT--;
                    j--;
                }
                else
                    break;    
            }
            
            if (i >= 0 && j >= 0 && S.charAt(i) != T.charAt(j))
                return false;
            if ((i >= 0) != (j >= 0))
                return false;
            i--;
            j--;
        }
        return true;
    }
}
