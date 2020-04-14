class Solution {
    public String stringShift(String s, int[][] shift) {
        
        int i,j,  leftShift = 0;
        int rightShift = 0;
        int len, diff = 0;
        char [] temp = s.toCharArray();
        
        String result = "";
        
        len = s.length();
        
        for(i = 0; i < shift.length; i++) {
            if (shift[i][0] == 0)
                leftShift += shift[i][1];
            else
                rightShift += shift[i][1];
            
        }
        
        if (rightShift > leftShift) {
            diff = rightShift - leftShift;
            
            for (i = 0; i < diff; i++) {
                result = "" + temp[len - 1];        
                for(j = 0; j < len - 1; j++) {
                    result = result + temp[j];
                }
                System.out.println(result);
                temp = result.toCharArray();
                System.out.println(Arrays.toString(temp));
            }

        }
        
        else if(leftShift > rightShift) {
            diff = leftShift - rightShift;
            
            for (i = 0; i < diff; i++) {
                result = "";
                for(j = 1; j < len; j++) {
                    result = result + temp[j];
                }
                
                result = result + temp[0];
                
                System.out.println(result);
                temp = result.toCharArray();
                System.out.println(Arrays.toString(temp));
            }
            
        }
        else
            result = s;
        
        return result;
        
    }
}
