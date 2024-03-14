public class TwoSum {
    public Integer[] twoSum(Integer[] arr, Integer target){
        Map<Integer, Integer> mp = new HashMap<>();
        int n = arr.length;
        for(int  i=0; i<n; i++){
            int s = target - arr[i];
            if(mp.containsKey(s)){
                return new Integer[]{i, mp.get(s)};
            }
            mp.put(arr[i], i);
        }

        return new Integer[0];
    }
