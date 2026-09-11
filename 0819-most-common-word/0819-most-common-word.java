class Solution {
    public String mostCommonWord(String paragraph, String[] banned) {
        paragraph=paragraph.toLowerCase();
        String []para=paragraph.split("[ !?',;.]+");
        HashSet<String> ban = new HashSet<>();
        for(int i=0;i<banned.length;i++){
            ban.add(banned[i]);
        }
        HashMap<String, Integer> map = new HashMap<>();
        for(int i=0;i<para.length;i++){
            if(!ban.contains(para[i])){
                map.put(para[i],map.getOrDefault(para[i],0)+1);
            }
        }
        int maxi=0;
        String res="";
        for(String key : map.keySet()){
            if(map.get(key)>maxi){
                maxi=map.get(key);
                res=key;
            }
        }
        return res;
    }
}

