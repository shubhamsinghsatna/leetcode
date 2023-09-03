class Solution {
    public int longestOnes(int[] nums, int k) {
        int flips = 0;
        int left = 0;
        int right = 0;
        int max = Integer.MIN_VALUE;
        int len = 0;
        while(right < nums.length) {
            int rNum = nums[right];
            if(flips == k && rNum == 0) {
                max = Math.max(max, len);
                int lNum = nums[left];

                if(lNum == 0) {
                    left++;
                    flips--;
                } else {
                    left++;
                }
                len--;
            } else {
                if(rNum == 0) {
                    flips++;
                }
                len++;
                right++;
            }
        }
        return Math.max(max, len);
    }
}