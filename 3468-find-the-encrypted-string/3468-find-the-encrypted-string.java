class Solution {
    public String getEncryptedString(String s, int k) {
        String encrypted = "";
        int encryptedIndex = 0;
        for(int index = 0; index < s.length(); index++){
            encryptedIndex = (index + k) % s.length();
            encrypted += s.charAt(encryptedIndex);
        }
        return encrypted;
    }
}