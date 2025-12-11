class Solution {
    private static int[] sieveOfErastothenes = new int[10000000];
    static{
        sieveOfErastothenes[1] = 1;
        for(int number = 2; number <= (int)Math.sqrt(sieveOfErastothenes.length); number++){
            if(sieveOfErastothenes[number] == 0){
                for(int sieveIndex = number * number; sieveIndex < sieveOfErastothenes.length; sieveIndex += number){
                    sieveOfErastothenes[sieveIndex] = 1;
                }
            }
        }
    }
    private boolean checkPrime(int number){
        if(number < sieveOfErastothenes.length) return sieveOfErastothenes[number] == 0;
        if(number % 2 == 0) return false;
        for (int num = 3; num * num <= number; num += 2) {
            if (number % num == 0) return false;
        }
        return true;
    }
    private static boolean checkPalindrome(StringBuilder sb){
        for(int index = 0; index < sb.length() / 2; index++){
            if(sb.charAt(index) != sb.charAt(sb.length() - 1 - index)){
                return false;
            }
        }
        return true;
    }
    public int primePalindrome(int n) {
        boolean palindrome = false;
        StringBuilder sb = new StringBuilder();
        int number = n;
        while(true){
            sb.append(number);
            if(checkPrime(number) && checkPalindrome(sb)){
                return number;
            }
            sb.setLength(0);
            number++;
            if (number > 10000000 && number < 100000000) {
                number = 100000000; 
            }
        }
    }
}