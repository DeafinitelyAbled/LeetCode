
// Please, open (copy & paste) the following link for the problem description:
// https://leetcode.com/problems/merge-sorted-array/description/

class Solution {
    public void merge(int[] nums1, int m, int[] nums2, int n) {

        int leftFirstIndex = 0;
        int leftLastIndex = m - 1;

        int rightFirstIndex = 0;
        int rightLastIndex = n - 1;

        int mergePositionIndex = nums1.length - 1;

        while ((leftFirstIndex <= leftLastIndex) && (rightFirstIndex <= rightLastIndex)) {
            if (nums2[rightLastIndex] >= nums1[leftLastIndex]) {
                nums1[mergePositionIndex] = nums2[rightLastIndex];
                --rightLastIndex;
            }
            else {
                nums1[mergePositionIndex] = nums1[leftLastIndex];
                --leftLastIndex;
            }
            --mergePositionIndex;
        }

        while (leftFirstIndex <= leftLastIndex) {
            nums1[mergePositionIndex] = nums1[leftLastIndex];
            --leftLastIndex;
            --mergePositionIndex;
        }

        while (rightFirstIndex <= rightLastIndex) {
            nums1[mergePositionIndex] = nums2[rightLastIndex];
            --rightLastIndex;
            --mergePositionIndex;
        }
    }
}
