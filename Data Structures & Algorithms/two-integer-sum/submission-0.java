class Solution {
public int[] twoSum(int[] nums, int target) {
        
        Map <Integer,Integer> mps= new HashMap<>();
        int []ret = new int[2];

        for(int i=0;i<nums.length ;++i)
        {   
            int comp = target-nums[i];
            if(mps.containsKey(comp)){                 
                if(i<mps.get(comp)){
                ret[0]= i;
                ret[1]= mps.get(comp);
                }
                else{
                ret[1]= i;
                ret[0]= mps.get(comp);

                }
                
                return ret;
            }
            else{
                 mps.put(nums[i], i);
            }
        }
        return ret;
    }
}
