class Solution {
    public static boolean canShip(int[] weights,int capacity,int days){
        int day = 1;
        int currentload = 0;
        for(int i = 0;i<weights.length;i++){
           if(currentload+weights[i]>capacity){
            currentload = weights[i];
            day++;
           }
           else{
            currentload +=weights[i];
           }
        }
         return day <= days;
    }
    public int shipWithinDays(int[] weights, int days) {
        int low = Arrays.stream(weights).max().getAsInt();
        int high = Arrays.stream(weights).sum();
        int ans = 0;
        while(low<=high){
            int mid = low + (high - low)/2;
            if(canShip(weights,mid,days)){
                ans = mid;
                high = mid - 1;
            }
            else{
                low = mid + 1;
            }
        }
        return ans;
    }
}