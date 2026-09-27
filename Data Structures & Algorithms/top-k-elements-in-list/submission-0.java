class Solution {
    public int[] topKFrequent(int[] nums, int k) {
        HashMap<Integer, Integer> frequency = new HashMap<>();

        for(int num: nums){
            frequency.put(num, frequency.getOrDefault(num, 0) + 1);
        }

        List<Integer> values = new ArrayList<>(frequency.keySet());

        values.sort((a,b) -> frequency.get(b) - frequency.get(a));

        int[] result = new int[k];

        for(int i = 0; i < k; i++){
            result[i]=values.get(i);
        }

        return result;
    }
}