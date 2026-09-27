class Solution {
    public int longestConsecutive(int[] nums) {
        if(nums.length <= 1){
              return nums.length;
        }
        HashSet<Integer> set = new HashSet<>();
        for(int num : nums){
            set.add(num);
        }
        int longest = 1;
        for(Integer num : set){
            int cur = 1;
            if(set.contains(num-1)){
                continue;
            }
            int current = num;
            while(set.contains(current+1)){
                 cur = cur + 1;
                 current = current + 1;
            }
            longest = Math.max(cur,longest);
        }
        return longest;
    }
}
