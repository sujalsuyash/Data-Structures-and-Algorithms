class Solution {
    public int[] twoSum(int[] nums, int target) {
        HashMap <Integer, Integer> map = new HashMap <> ();
        for (int i=0; i<nums.length; i++) {
            int rqdNum = target - nums[i];
            if(map.containsKey(rqdNum)) {
                return new int [] {map.get(rqdNum), i};
            } else {
                map.put(nums[i], i);
            }
        }
        return new int[] {};
    }
}