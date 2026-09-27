class Solution {
    public boolean isPalindrome(String s) {
        StringBuilder str = new StringBuilder();

        for(int i = 0; i < s.length(); i++){
            char ch = s.charAt(i);

            if(Character.isLetterOrDigit(ch)){
                str.append(Character.toLowerCase(ch));
            }
        }

        int val = str.length();

        for(int i = 0; i < val / 2; i++){
            if(str.charAt(i) != str.charAt(val - i - 1)){
                return false;
            }
        }

        return true;
    }
}
