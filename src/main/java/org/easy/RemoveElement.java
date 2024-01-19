package org.easy;

public class RemoveElement {
    public int removeElement(int[] nums, int val) {
        int k = 0;
        for(int i = 0; i < nums.length; i++){
            if(nums[i] != val){
                nums[k] = nums[i];
                k++;
            }
        }
        return k;
    }
}

/*
Using the two pointer technique to solve this problem
There are two pointers i and k.
    i will be moving faster than k.
Execute the loop till the end of the nums array.
The loop is resaving the array with the value at index i with the value at index x.

 */
