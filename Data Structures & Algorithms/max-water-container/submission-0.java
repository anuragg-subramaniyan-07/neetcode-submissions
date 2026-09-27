class Solution {
    public int maxArea(int[] heights) {
        int l = 0;
        int r = heights.length - 1;
        int max_volume = Integer.MIN_VALUE;
        while(l < r){
            int height = Math.min(heights[l],heights[r]);
            int width = r - l;
            int cur_vol = height * width;
            max_volume = Math.max(cur_vol,max_volume);
            if(heights[l] < heights[r]){
                l++;
            }
            else{
                r--;
            }
        }
        return max_volume;
    }
}
