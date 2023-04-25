// Binary Search approach
// define the range of binary search. So left will be index 0 and right will be the last index of the given array which is lengh-1
// find the mid index then we will find number of missing numbers:
// arr[mid]-(mid+1)   
// left become mid+1 else right become mid-1
// return left+k
class Solution {
    public int findKthPositive(int[] arr, int k) {
        int left = 0;
        int right = arr.length - 1;
        while (left <= right) {
            int mid = (left + right) / 2;
            int countMissing = arr[mid] - (mid + 1);
            if (countMissing < k) {
                left = mid + 1;
            }else{
                right = mid - 1;
            } 
        }
        return left + k;
    }
}
// T.C -> O(logn)
// S.C -> O(1)