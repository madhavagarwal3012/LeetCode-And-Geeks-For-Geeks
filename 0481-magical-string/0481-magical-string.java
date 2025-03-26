class Solution {
    public int magicalString(int n) {
        int countOne = 0;
        if(n == 0){
            return countOne;
        }
        else if(n == 1 || n == 2 || n ==3){
            return ++countOne;
        }
        else{
            StringBuilder magicString = new StringBuilder("122");
            magicString.append("11");
            if(n == 4){
                return countOne+=2;
            }
            countOne = 3;
            int length = magicString.length();
            int previousIndex = length - 2;
            int currentIndex = length - 1;

            while(length < n){
                if(magicString.charAt(previousIndex) == '1' && magicString.charAt(currentIndex) == '1'){
                    magicString.append("2");
                    previousIndex++;
                    currentIndex++;
                    length++;
                }
                else if(magicString.charAt(previousIndex) == '1' && magicString.charAt(currentIndex) == '2'){
                    magicString.append("1");
                    length++;
                    if(length <= n){
                        countOne++;
                    }
                    previousIndex++;
                    currentIndex++;
                }
                else if(magicString.charAt(previousIndex) == '2' && magicString.charAt(currentIndex) == '1'){
                    magicString.append("22");
                    length+=2;
                    previousIndex++;
                    currentIndex = length - 1;
                }
                else{
                    magicString.append("11");
                    length+=2;
                    if(length <= n){
                        countOne+=2;
                    }
                    else if(length - 1 == n){
                        countOne++;
                    }
                    previousIndex++;
                    currentIndex = length-1;
                }
            }
        }
        return countOne;
    }
}