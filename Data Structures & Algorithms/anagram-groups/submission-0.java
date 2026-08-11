class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        Map<String, List<String>> mp = new HashMap<>();
        for(String s: strs){
            int[] iar= new int[26];
            for(char c : s.toCharArray()){
                iar[c-'a']++;
            }
        StringBuilder key = new StringBuilder();
        for(int i: iar){
            key.append(i).append("#");
        }
        String k1 = key.toString();
        mp.computeIfAbsent(k1, k -> new ArrayList<String>()).add(s);
        }
        return new ArrayList<>(mp.values());

    }
}
