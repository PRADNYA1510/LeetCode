class Solution {
    public int longestConsecutive(int[] nums) {
        HashSet<Integer> set = Arrays.stream(nums)
                             .boxed()
                             .collect(Collectors.toCollection(HashSet::new));
        int longestStreak = 0;
        for(int num : set){
            if(! set.contains(num - 1)){
                int startelem = num;
                int currentStreak = 1;
                    while(set.contains(startelem + 1)){
                        currentStreak++;
                        startelem = startelem+1;
                    }
                longestStreak = Math.max(longestStreak, currentStreak);
            }
                
        }
        return longestStreak;
    }
    
}
