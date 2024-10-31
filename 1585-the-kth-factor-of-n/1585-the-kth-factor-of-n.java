class Solution {
    public int kthFactor(int n, int k) {
        List<Integer> factorsList1 = new ArrayList<>();
        List<Integer> factorsList2 = new ArrayList<>();
        int factorCount = 0;
        for(int numberCount = 1; numberCount <= (int)Math.sqrt(n); numberCount++){
            if(n % numberCount == 0){
                if(n / numberCount != numberCount){
                    factorCount+=2;
                    factorsList1.add(numberCount);
                    factorsList2.add(n / numberCount);
                }
                else{
                    factorCount++;
                    factorsList1.add(numberCount);
                }
            }
        }
        if(factorCount < k){
            return -1;
        }
        else{
            for(int index = factorsList2.size() - 1; index >= 0; index--){
                factorsList1.add(factorsList2.get(index));
            }
            return factorsList1.get(k - 1);
        }
    }
}