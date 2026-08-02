class Solution {
    public static void swap(int[] nums,int l,int r){
        int temp = nums[l];
        nums[l] = nums[r];
        nums[r] = temp;
    }
    public void moveZeroes(int[] nums) {
        int left = 0;
       for(int right = 0;right<nums.length;right++){
          if(nums[right]!=0){
            swap(nums,left,right);
            left++;
          }
       }

    }
}