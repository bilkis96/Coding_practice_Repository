class Solution {
    public boolean containsDuplicate(int[] nums) {
        Map<Integer, Integer> mp = new HashMap<>();
        for(int i=0; i<nums.length; i++){
            if(!mp.containsKey(nums[i]))
            {
                mp.put(nums[i], 1);
            }
            else{
                mp.put(nums[i], mp.get(nums[i])+1);
            }
        }
        for(Map.Entry<Integer, Integer> entry : mp.entrySet())
        {
            Integer value = entry.getValue();
            if(value>1){
                return true;
            }
        }
        return false;
    }
}
