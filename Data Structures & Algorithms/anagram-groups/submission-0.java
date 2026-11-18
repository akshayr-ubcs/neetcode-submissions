class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {

        Map <String,List<String>> map = new HashMap<>();
        List<List<String>> retList = new ArrayList<>();
        if(strs.length==0){
            return retList;
        }

        for(String str :strs){
            String sorted = sorted(str);
            if(map.containsKey(sorted)){
                map.get(sorted).add(str);
            }
            else{
                List<String> arr = new ArrayList<>();
                arr.add(str);
                map.put(sorted, arr);
            }

        }

        
        for(String key : map.keySet()){
            List<String> nlist = new ArrayList<>();
            for(String val : map.get(key)){
                nlist.add(val);
            }
            retList.add(nlist);
        }

        return retList;
        
    }

    public String sorted(String word){
        char[] chars = word.toCharArray();
        Arrays.sort(chars);
        return new String(chars);
    }
}
