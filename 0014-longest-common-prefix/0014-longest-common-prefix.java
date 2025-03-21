class Solution {
    public String longestCommonPrefix(String[] strs) {
        if (strs.length == 1) {
            return strs[0];
        }

        StringBuilder commonPrefix = new StringBuilder();
        String firstString = strs[0];
        String secondString = strs[1];

        for (int index = 0; index < firstString.length() && index < secondString.length(); index++) {
            if (firstString.charAt(index) != secondString.charAt(index)) {
                break;
            }
            commonPrefix.append(firstString.charAt(index));
        }

        for (int strsIndex = 2; strsIndex < strs.length; strsIndex++) {
            int newLength = 0;
            for (int index = 0; index < commonPrefix.length() && index < strs[strsIndex].length(); index++) {
                if (commonPrefix.charAt(index) != strs[strsIndex].charAt(index)) {
                    break;
                }
                newLength++;
            }
            commonPrefix.setLength(newLength);
        }

        return commonPrefix.toString();
    }
}
