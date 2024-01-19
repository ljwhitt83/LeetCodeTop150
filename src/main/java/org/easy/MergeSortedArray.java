package org.easy;

public class MergeSortedArray {
    public void merge(int[] nums1, int m, int[] nums2, int n) {

        //setting pointer one to the end of the valid elements in nums1
        int pointer1 = m - 1;

        //setting pointer two to the end of the valid elements in nums2
        int pointer2 = n - 1;

        //setting a pointer for the total of the merged array at nums1 completion
        int pointerTotal = m+ n - 1;

        //loop through the arrays comparing which one is larger and decreasing the count
        while (pointer1 >= 0 && pointer2 >= 0){
            if (nums1[pointer1] > nums2[pointer2]){
                nums1[pointerTotal--] = nums1[pointer1--];
            }else {
                nums1[pointerTotal--] = nums2[pointer2--];
            }
        }

        while(pointer2 >= 0) {
            nums1[pointerTotal--] = nums2[pointer2--];
        }

    }
}
/*
The two pointer technique.
Compares a value from each array.
And places it to the left or to the right depending on whether it is less than or greater than the target number
Keeps running until the one array reaches 0 first.
If there are still numbers in the 2nd array, keep adding to the first array until the 2nd one empties.

 */
