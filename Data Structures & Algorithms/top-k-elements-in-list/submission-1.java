class Solution {
    public int[] topKFrequent(int[] nums, int k) {
        HashMap<Integer,Integer> count = new HashMap<>();
        for(int i=0;i<nums.length;i++){
            count.put(nums[i],count.getOrDefault(nums[i],0)+1);
        }
        List<List<Integer>> bucket = new ArrayList<>();
        for(int i=0;i<nums.length+1;i++){
            bucket.add(new ArrayList<>());
        }
        for(Integer key : count.keySet()){
            bucket.get(count.get(key)).add(key);
        }
        int[] top = new int[k];
        int j = 0;
        for(int i = nums.length; i > 0 && j < k; i--) {
            for(int num : bucket.get(i)) {
               if(j == k)
                  break;
               top[j] = num;
               j++;
            }
        }
        return top;
}
}
