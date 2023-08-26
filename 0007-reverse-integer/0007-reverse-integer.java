class Solution {
    public static String Reversed_String(String str) {
        String reversed_string = "";
        int end = str.length() - 1;
        while (end >= 0) {
            reversed_string += str.charAt(end);
            end--;
        }
        return reversed_string;
    }
    
    public int reverse(int x) {
        if (x > Integer.MAX_VALUE || x < Integer.MIN_VALUE) {
            return 0;
        }
        
        String str = Integer.toString(x);
        
        if (Character.getNumericValue(str.charAt(0)) < 0) {
            x = Math.abs(x);
            str = Integer.toString(x);
            str += "-";
        }
        
        str = Reversed_String(str);
        
        try {
            x = Integer.parseInt(str);
        } 
        catch (NumberFormatException e) {
            return 0; 
        }
        
        return x;
    }
}
