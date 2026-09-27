class Solution {
    public boolean hasDuplicate(int[] nums) {
        HashMap<Integer, Integer> frequency = new HashMap<>();

        for(int num: nums) {
            frequency.put(num, frequency.getOrDefault(num, 0) + 1);
        }

        for(Map.Entry<Integer, Integer> entry :  frequency.entrySet()) {
            int value = entry.getValue();
            if(value>1) return true;
        }

        return false;
    }
}