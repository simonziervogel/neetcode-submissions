class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        HashMap<Integer, int[]> hm = new HashMap<Integer, int[]>();
        
         List<List<String>> result = new  ArrayList<List<String>>();
        
        for(int i=0; i<strs.length; i++){
            //HashMap bei i=0 bekommt Frequencies
            int[] temp = new int[26];
            for(int j=0; j<strs[i].length(); j++){
                int index = strs[i].charAt(j) - 'a';
                temp[index] += 1;
            }
            hm.put(i, temp);

        }

        //hier alle indexe von hm befüllt mit jeweiligen frequencies arrays, jetzt anagramme prüfen und gruppieren

        for(int i=0; i<strs.length; i++){

            if (hm.get(i) == null) {
            continue;
             }
            
            List<String> li = new ArrayList<String>();
            int[] curr = hm.get(i);
            //if(hm.get(i) != null){
            li.add(strs[i]);
           // }
            for(int j=i+1; j<strs.length; j++){
                if(hm.get(j) != null && Arrays.equals(curr, hm.get(j))){
                    li.add(strs[j]);
                    hm.remove(j);
                }
            }
            hm.remove(i);
            result.add(li);
        }
        return result;
    }
}
