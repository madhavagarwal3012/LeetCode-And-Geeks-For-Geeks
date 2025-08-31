class Solution {
    public int repeatedStringMatch(String a, String b) {
        StringBuilder sb = new StringBuilder();
        int count = 0;
        
        while (sb.length() < b.length()) {
            sb.append(a);
            count++;
        }
        
        if (contains(sb, b)) return count;
        
        sb.append(a);
        count++;
        if (contains(sb, b)) return count;
        
        return -1;
    }
    
    private boolean contains(StringBuilder sb, String b) {
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
