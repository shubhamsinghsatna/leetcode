class Solution {
    public double findMaxAverage(int[] nums, int k) {

        double sum=Integer.MIN_VALUE;
        double cur=0;

        for(int i=0;i<k;i++) cur+=nums[i];

        if(cur>sum) sum=cur;

        int j=0;
        for(int i=k;i<nums.length;i++){
            cur+=nums[i];
            cur-=nums[j];
            sum=Math.max(sum,cur);
            j++;
        }
        return sum/k;

    }
}