class Solution {
    public int[] twoSum(int[] nums, int target) {
        int[] ans = new int[2];
        Map<Integer, Integer> hashMap = new HashMap<>();
        int n = nums.length;

        for(int i=0;i<n;i++){
            int remain = target - nums[i];
            if(hashMap.containsKey(remain)){
                ans[0] = i;
                ans[1] = hashMap.get(remain);
                return ans;
            }
            hashMap.put(nums[i],i);
        }
        return ans;
    }
}