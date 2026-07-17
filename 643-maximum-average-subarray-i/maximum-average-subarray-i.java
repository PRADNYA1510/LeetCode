class Solution {
    public double findMaxAverage(int[] nums, int k) {
        int maxNumber = 0;
        double maxAverage = 0.0;
        int j = 0;
        for(int i = 0;i<k;i++){
          maxNumber += nums[i];
        }
        maxAverage =  (double)maxNumber/k;
        for(int n = k;n<nums.length;n++){
           maxNumber = maxNumber-nums[j]+nums[n];
           maxAverage = Math.max(maxAverage, (double)maxNumber/k);
           j++;  
        }
        return maxAverage;
    }
}