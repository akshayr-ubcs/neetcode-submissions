class Solution {
    public int[] topKFrequent(int[] nums, int k) {
        Map <Integer,Integer> mp = new HashMap<>();
        for(int i : nums){
            if(mp.containsKey(i))
            {
                mp.put(i,mp.get(i)+1);
            }
            else
            mp.put(i,1);

        }
        PriorityQueue<Integer> p = new PriorityQueue<>(
            (a,b)-> mp.get(a)-mp.get(b)
        );

        for(int key: mp.keySet()){
            p.add(key);
            if(p.size()>k){
                p.poll();
            }
        }

        int []result = new int[k];
        for(int i=0; i<k;++i){
            result[i]= p.poll();
        }

        return result;


    }
}
