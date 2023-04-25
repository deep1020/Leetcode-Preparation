class Solution {
    public int majorityElement(int[] nums) {
        Arrays.sort(nums);
        return nums[nums.length/2];
    }
}
// T.C -> O(nlogn)
// S.C -> O(1)