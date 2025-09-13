/*
Given an array of integers numbers that is sorted in non-decreasing order.

Return the indices (1-indexed) of two numbers, [index1, index2], 
such that they add up to a given target number target and index1 < index2. 
Note that index1 and index2 cannot be equal, therefore you may not use the same element twice.

There will always be exactly one valid solution.

Your solution must use O(1) additional space.
*/

class Solution {
    public int[] twoSum(int[] numbers, int target) {
        //loop through the numbers array from the left
        for (int i = 0; i < numbers.length; i++) {
            //assign left and right pointer starting with the second
            //index from the left, since we are already checking the 
            //first index against the target number
            int left = i + 1;
            int right = numbers.length - 1;
            //the number we are looking for = target - first index
            int correctSum = target - numbers[i];

            //binary search the rest of the numbers from each outer
            //iteration
            while(left <= right) {
                //find middle index, avoiding overflow
                int middle = left + (right - left) / 2;
                //check if correct number is found by slicing array
                //in half and finding whether that number is too high
                //or too low
                if (correctSum == numbers[middle]) {
                    return new int[] {i + 1, middle + 1};
                } else if (numbers[middle] < correctSum) {
                    left = middle + 1;
                } else {
                    right = middle - 1;
                }
            }

        }

        return new int[0];
    }
}

// Credits to Neetcode
