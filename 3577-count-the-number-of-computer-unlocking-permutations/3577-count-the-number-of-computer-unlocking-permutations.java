class Solution {
    public int countPermutations(int[] complexity) {
        long noOfPermutations = 1;
        long mod = 1000000007;
        for(int number = 1; number < complexity.length; number++){
            if(complexity[number] <= complexity[0]){
                return 0;
            }
            noOfPermutations = (noOfPermutations * number) % mod;
        }
        return (int)(noOfPermutations % mod);
    }
}