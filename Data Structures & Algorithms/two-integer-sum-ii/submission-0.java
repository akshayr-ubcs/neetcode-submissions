class Solution {
    public int[] twoSum(int[] numbers, int target) {
        int left = 0;
        int right = numbers.length-1;

        while(left<right){
            int val = numbers[left]+numbers[right];
            if(val == target){
                int[] res= {left+1,right+1};
                return res;
            }
            else if(val < target){
                ++left;
            }
            else{
                --right;
            }
        }
    return new int[2];
    }
}
