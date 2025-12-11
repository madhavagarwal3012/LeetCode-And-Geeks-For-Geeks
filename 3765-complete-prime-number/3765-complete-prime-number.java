class Solution {
    private static int[] sieveOfErastothenes = new int[1000001];
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
    public boolean completePrime(int num) {

        String number = String.valueOf(num);

        StringBuilder prefix = new StringBuilder();
        StringBuilder suffix = new StringBuilder();

        for(int index = 0; index < number.length(); index++){
            prefix.append(number.charAt(index));
            suffix.insert(0, number.charAt(number.length() - 1 - index));

            if(sieveOfErastothenes[Integer.parseInt(prefix.toString())] != 0 || sieveOfErastothenes[Integer.parseInt(suffix.toString())] != 0){
                return false;
            }
        }
        return true;
    }
}