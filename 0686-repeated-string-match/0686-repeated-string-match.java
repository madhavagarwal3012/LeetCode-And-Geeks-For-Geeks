class Solution {
    public int repeatedStringMatch(String a, String b) {
        StringBuilder sb = new StringBuilder();
        int repeatitionCount = 0;
        
        while (sb.length() < b.length()) {
            sb.append(a);
            repeatitionCount++;
        }
        
        if (checkSubstring(sb, b)) return repeatitionCount;
        
        sb.append(a);
        repeatitionCount++;
        if (checkSubstring(sb, b)) return repeatitionCount;
        
        return -1;
    }
    
    private boolean checkSubstring(StringBuilder sb, String b) {
        int n = sb.length();
        int m = b.length();
        
        for (int i = 0; i <= n - m; i++) {
            boolean match = true;
            for (int j = 0; j < m; j++) {
                if (sb.charAt(i + j) != b.charAt(j)) {
                    match = false;
                    break;
                }
            }
            if (match) return true;
        }
        return false;
    }
}
