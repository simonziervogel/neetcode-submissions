class Solution {
    public boolean isAnagram(String s, String t) {
        HashMap<Character, Integer> hm = new HashMap<Character, Integer>();

        if(s.length() != t.length()){
            return false;
        }

        for(int i=0; i<s.length(); i++){
            if(hm.containsKey(s.charAt(i))){
                int value = hm.get(s.charAt(i));
                hm.put(s.charAt(i), value+1);
            }
            else{
                hm.put(s.charAt(i), 1);
            }
        }

        for(int j=0; j<t.length(); j++){
            if(!hm.containsKey(t.charAt(j))){
                return false;
            }
            else{
                int value = hm.get(t.charAt(j));
                hm.put(t.charAt(j), value-1);
            }
        }

        for(Integer c : hm.values()){
            if(c!=0){
                return false;
            }
        }
        return true;
    }
}
