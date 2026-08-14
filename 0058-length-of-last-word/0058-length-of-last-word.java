class Solution {
    public int lengthOfLastWord(String s) {
        String trimmed = s.trim();
        String lastWord = trimmed.substring(trimmed.lastIndexOf(" ") + 1);
        int ls = lastWord.length();
        return ls;
    }
    
}