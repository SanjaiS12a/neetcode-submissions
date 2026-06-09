class Solution {
    public boolean isAnagram(String s, String t) {
      if(s.length()!=t.length()){
            return false;
      }  
      HashMap<Character,Integer> l = new HashMap<>();
      HashMap<Character,Integer> w = new HashMap<>();
      for(int i=0;i<s.length();i++){
        l.put(s.charAt(i), l.getOrDefault(s.charAt(i),0)+1);
        w.put(t.charAt(i), w.getOrDefault(t.charAt(i),0)+1);
      }
      if(l.equals(w)){
        return true;
      }
      return false;
    }
}
