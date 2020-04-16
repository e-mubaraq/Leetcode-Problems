class Solution {
    public boolean checkValidString(String s) {
        int i, len;
        int leftP, rightP;
        
        len = s.length();
        
        leftP = 0;
        for (i = 0; i < len; i++) {
            if (s.charAt(i) == '(' || s.charAt(i) == '*')
                leftP++;
            else
                leftP--;
            
            if (leftP < 0)
                return false;
        }
        
        rightP = 0;
        for (i = len - 1; i >= 0; i--) {
            if (s.charAt(i) == ')' || s.charAt(i) == '*')
                rightP++;
            else
                rightP--;
            
            if (rightP < 0)
                return false;
        }
        
        return true;
        
    }
}
