class Solution {
    public boolean searchMatrix(int[][] matrix, int target) {
        int left = 0;
        int right = (matrix[0].length * matrix.length)-1;
        int columns = matrix[0].length;
        while(left<=right){
            int mid = left + (right - left)/2;
            int row = mid/columns;
            int col = mid%columns;

            if(matrix[row][col]==target){
                return true;
            }
            else if(matrix[row][col]>target){
                right = mid - 1;
            }
            else{
                left = mid + 1;
            }

        }
        return false;
    }
}