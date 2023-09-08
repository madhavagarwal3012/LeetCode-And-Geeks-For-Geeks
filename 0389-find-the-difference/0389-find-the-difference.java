import java.util.Arrays;
class Solution {
    public static char findTheDifference(String s, String t) {
        char array[] = s.toCharArray();
        Arrays.sort(array);
        s = new String(array);

        array = t.toCharArray();
        Arrays.sort(array);
        t = new String(array);

        int start = 0;
        int end = s.length();
        int small_len = t.length();
        char last_char = ' ';

        if (t.length() > s.length()) {
            end = t.length();
            small_len = s.length();
            last_char = t.charAt(t.length() - 1);
        } 
        else {
            last_char = s.charAt(s.length() - 1);
        }

        while (start < end) {
            if (start < small_len && s.charAt(start) != t.charAt(start)) {
                return t.charAt(start);
            }
            start++;
        }
        return last_char;
    }
}
