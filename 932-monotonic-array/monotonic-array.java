class Solution {
    public boolean isMonotonic(int[] nums) {
        
        boolean incr=false,decr=false;
        for(int i=0;i<nums.length-1;i++){
            if(incr){
                if(!(nums[i]<=nums[i+1])){
                    return false;
                }else{
                    continue;
                }
            }
            if(decr){
                if(!(nums[i]>=nums[i+1])){
                    return false;
                }else{
                    continue;
                }
            }
            if(nums[i]>nums[i+1]){
                decr=true;
            }
            if(nums[i]<nums[i+1]){
                incr=true;
            }
        }
        return true;

    }
}