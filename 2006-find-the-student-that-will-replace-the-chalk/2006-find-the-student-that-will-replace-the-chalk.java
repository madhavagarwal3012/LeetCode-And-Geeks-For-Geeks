class Solution {
    public int chalkReplacer(int[] chalk, int k) {
        int index = 0;
        while(k >= chalk[index]){
            k = k - chalk[index];
            index++;
            if(index == chalk.length){
                index = 0;
            }
        }
        return index;
    }
}