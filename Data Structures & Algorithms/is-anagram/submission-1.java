class Solution {
    public boolean isAnagram(String s, String t) {
        HashMap<Character, Integer> firstAnagram = new HashMap<>();
        HashMap<Character, Integer> secondAnagram = new HashMap<>();

        for (char c : s.toCharArray()) {
            firstAnagram.put(c, firstAnagram.getOrDefault(c, 0) + 1);
        }
        for(char c : t.toCharArray()) {
            secondAnagram.put(c, secondAnagram.getOrDefault(c, 0) + 1);
        }

        if(firstAnagram.equals(secondAnagram)){
            return true;
        }
        return false;
    }
}