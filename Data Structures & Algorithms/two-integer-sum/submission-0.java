class Solution {
    public int[] twoSum(int[] nums, int target) {
        
        Map<Integer,Integer> mp= new HashMap<>();
        int[] arr = new int[2];

        for(int i=0;i<nums.length;++i){
            if(mp.containsKey(target-nums[i])){
                int ind = mp.get(target-nums[i]);
                if(i>ind){
                    arr[0]= ind;
                    arr[1]= i;
                }
                else{
                    arr[0]=i;
                    arr[1]=ind;
                }


            }
            else{
                mp.put(nums[i],i);
            }
        }
        return arr;

    }
}
