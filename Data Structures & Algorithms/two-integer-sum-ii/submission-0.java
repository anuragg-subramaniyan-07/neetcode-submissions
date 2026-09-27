class Solution {
    public int[] twoSum(int[] numbers, int target) {
        int left = 0;
        int right = numbers.length - 1;
        while(left < right){
            if(numbers[left] + numbers[right] == target){
                 int[] result = {left+1,right+1};
                 return result;
            }
            else if(numbers[left] + numbers[right] < target){
                left = left + 1;
            }
            else{
                 right = right - 1;
            }
        }
        
        return null;
    
    }
}
