class Solution {
    public boolean canConstruct(String ransomNote, String magazine) {
        HashMap<Character,Integer> map1= new HashMap<>();
        HashMap<Character,Integer> map2= new HashMap<>();
        for(int i=0;i<magazine.length();i++){
            char ch=magazine.charAt(i);
            map1.put(ch,map1.getOrDefault(ch,0)+1);
        }
        for(int i=0;i<ransomNote.length();i++){
            char s=ransomNote.charAt(i);
            map2.put(s,map2.getOrDefault(s,0)+1);
        }
        for(char ch : map2.keySet())
        {
            if(map1.getOrDefault(ch, 0) >= map2.get(ch))
            {
                continue;
            }
            else 
                return false;
        }
        return true;
    }
}
