class Solution {
    public void reverseString(char[] s) {
        int end = s.length - 1;
        int index = 0;
        
        while (end >= index) {
            char temp=s[index];
            s[index] = s[end];
            s[end]=temp;
            end--;
            index++;
        }
    }
}
