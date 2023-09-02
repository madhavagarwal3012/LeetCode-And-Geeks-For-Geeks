class Solution {
    public static int lengthOfLastWord(String s) {
        int end = s.length() - 1;
        int sub_end = 0;
        int start = 0;
        int count = 0;

        while (end > 0) {
            if (s.charAt(end) == ' ') {
                end--;
            } else {
                break;
            }
        }

        if (s.charAt(end) != ' ') {
            sub_end = end;
            while (sub_end >= 0) {
                if (s.charAt(sub_end) != ' ') {
                    sub_end--;
                    count++;
                } else {
                    start = sub_end + 1;
                    break;
                }
            }
        }
        return count;
    }
}
