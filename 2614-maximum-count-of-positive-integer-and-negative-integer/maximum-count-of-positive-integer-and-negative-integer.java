class Solution {
    public int maximumCount(int[] nums) {
        int neg = checkNum(nums, 0);
        int pos = nums.length - checkNum(nums, 1);
        return Math.max(neg,pos);
    }

    public int checkNum(int[] nums, int target){
        int left = 0;
        int right = nums.length-1;
        int ans = nums.length;
        while(left<=right){
            int mid = left+(right-left)/2;
            if(nums[mid]<target){
                left=mid+1;
            }
            else{
                ans = mid;
                right=mid-1;
            }
        }
        return ans;
    }
}