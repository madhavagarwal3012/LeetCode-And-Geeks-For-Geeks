class Solution {
    public int countPartitions(int[] nums, int k) {
        int[] prefix = new int[nums.length + 1];
        int[] dp = new int[nums.length + 1];

        prefix[0] = 1;
        dp[0] = 1;

        TreeMap<Integer, Integer> s = new TreeMap<>();
        int mod = 1000000007;

        int windowIndex = 0;
        for(int index = 0; index < nums.length; index++){
            s.put(nums[index], s.getOrDefault(nums[index], 0) + 1);
            while(windowIndex <= index && s.lastKey() - s.firstKey() > k){
                int count = s.get(nums[windowIndex]);
                if (count == 1) s.remove(nums[windowIndex]);
                else s.put(nums[windowIndex], count - 1);
                windowIndex++;
            }
            if(windowIndex > 0){
                dp[index + 1] = (prefix[index] - prefix[windowIndex - 1] + mod) % mod;
            }
            else{
                dp[index + 1] =  prefix[index] % mod; 
            }
            prefix[index + 1] = (prefix[index] + dp[index + 1]) % mod;
        }
        return dp[nums.length];
    }
}