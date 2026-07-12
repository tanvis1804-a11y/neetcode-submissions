class Solution {
    public int majorityElement(int[] nums) {
        HashMap<Integer, Integer> count = new HashMap<>();
        int maxCount = 0;
        int res = 0;
        for (int i=0; i<nums.length; i++){
            count.put(nums[i], count.getOrDefault(nums[i], 0) + 1);
            if (count.get(nums[i]) > maxCount) {
                res = nums[i];
                maxCount = count.get(nums[i]);
            }
        }
        return res;
    }
}