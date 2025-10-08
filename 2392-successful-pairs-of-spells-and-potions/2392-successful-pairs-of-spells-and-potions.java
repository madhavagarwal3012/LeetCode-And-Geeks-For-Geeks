class Solution {
    public int[] successfulPairs(int[] spells, int[] potions, long success) {
        Arrays.sort(potions);
        int[] result = new int[spells.length];

        for(int index = 0; index < spells.length; index++){
            int firstSuccessfulIndex = potions.length;
            int si = 0;
            int ei = potions.length - 1;

            while(si <= ei){
                int mid = (si + ei) / 2;
                long product = 1;
                product = (product * spells[index]) * potions[mid];
                if(product < success){
                    si = mid + 1;
                }
                else{
                    firstSuccessfulIndex = mid; 
                    ei = mid - 1;
                }
            }
            result[index] = potions.length - firstSuccessfulIndex;
        }
        return result;
    }
}