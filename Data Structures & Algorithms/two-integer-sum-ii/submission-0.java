class Solution {
    public int[] twoSum(int[] numbers, int target) {
        Map<Integer, Integer> map = new HashMap<>();
        int[] solution = new int[2];
        for(int i = 0; i < numbers.length; i++) 
        {
            map.put(numbers[i], i);
        }
        
        for(int i = 0; i < numbers.length; i++) {
            int x = target - numbers[i];
            if(map.containsKey(x) && map.get(x)!=i) 
            {
                solution[0] = i + 1;
                solution[1] = map.get(x) + 1;
                break;
            }
        }
        return solution;
    }
}