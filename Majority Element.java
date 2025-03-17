class Solution {
    public int majorityElement(int[] nums) {
        HashMap<Integer, Integer> freqMap = new HashMap<>();
        
            for(int num: nums){
                if(!freqMap.containsKey(num)){
                    freqMap.put(num, 1);
                }
                else{
                    freqMap.put(num, freqMap.get(num)+1);
                }
            }
        
        for(Integer key: freqMap.keySet()){
            if(freqMap.get(key)>nums.length/2){
                return key;
            }
        }
    return 0;
    }
}
