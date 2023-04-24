class Solution {
    public int missingNumber(int[] nums) {
        int n = nums.length;
        Arrays.sort(nums);
        for(int i=0;i<n;i++){
            if(nums[i]!=i){
                return nums[i]-1;
            }
        }
        return nums[n-1]+1;
    }
}
// T.C -> O(nlogn)
// S.C -> O(1)