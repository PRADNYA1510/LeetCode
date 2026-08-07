class Solution {
    public static long requiredSpeed(int[] piles, int mid){
        long speed = 0;
        for(int i = 0;i<piles.length;i++){
            speed+=((long) piles[i] + mid - 1) / mid;
        }
        return speed;
    }
    public int minEatingSpeed(int[] piles, int h) {
        int low = 1;
        int high = Arrays.stream(piles).max().getAsInt();
        int ans = high;

        while(low<=high){
            int mid = low + (high - low)/2;
            long speed = requiredSpeed(piles,mid);
            if(speed<=h){
                high = mid - 1;
                ans = mid;
            }
            else{
                low = mid + 1;
            }
        }
        return ans;
    }
}