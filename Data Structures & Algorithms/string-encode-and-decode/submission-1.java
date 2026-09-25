class Solution {
    
    public String encode(List<String> strs) {
        StringBuilder result = new StringBuilder();
        for(String s : strs){
            result.append(s.length());
            result.append('#');
            result.append(s);
        }
        return result.toString();
    }

    public List<String> decode(String str) {
         List<String> res = new ArrayList<>();
         int i = 0;
         while(i < str.length()){
              int j = i;
              while(str.charAt(j) != '#'){
                 j++;
              }
              int len = Integer.parseInt(str.substring(i,j));
              j++;
              res.add(str.substring(j,j+len));
              i = j + len;
         }
        return res; 
    }
}
