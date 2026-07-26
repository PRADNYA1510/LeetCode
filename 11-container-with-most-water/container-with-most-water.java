class Solution {
    public int maxArea(int[] height) {
        int Max = 0;
        int left =0,right = height.length-1;
        while(left<right){
          int width = right - left;
          int data = Math.min(height[left],height[right]);
          int area = width * data;
          Max = Math.max(Max,area);
          if(height[left]>=height[right]){
            right--;
          }
          else{
            left++;
          }
        }
        return Max;
    }
}