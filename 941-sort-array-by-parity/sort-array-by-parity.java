class Solution {
    public int[] sortArrayByParity(int[] nums) {
        int x=0;
        int y=0;
        for(int i=0;i<nums.length;i++){
            if(nums[y]%2==0){
                int temp = nums[y];
                nums[y] = nums[x];
                nums[x] = temp;
                x++;
                y++;
            }else{
                y++;
            }
        }
        return nums;
    }
}