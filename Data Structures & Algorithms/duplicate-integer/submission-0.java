class Solution {
    public boolean hasDuplicate(int[] nums) {
        if (nums.length <= 1)
            return false;
        HashSet<Integer> Set = new HashSet<>();
        for(int i=0;i<nums.length;i++){
            if(Set.contains(nums[i]) == false)
                Set.add(nums[i]);
            else
                return true;   
        }
        return false;

    }
}