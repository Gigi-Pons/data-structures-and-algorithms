//SquaredArray.java

import java.util.*;

class SquaredArray {
    public static void main(String[] args) {
        int[] nums = {-5, 1, 2, 3, 4};
        int[] result = sortedSquaredArray1(nums);
        for(int n : result) {
            System.out.println(n);
        }

        System.out.println("---------------------------------------\n");

        int[] result2 = sortedSquaredArray2(nums);
        for(int n : result2) {
            System.out.println(n);
        }
    }

    //O(n log n) time complexity
    public static int[] sortedSquaredArray1(int[] array) {
        int[] newArray = new int[array.length];

        for(int n=0; n < array.length; n++) {
            int value = array[n];
            newArray[n] = value * value;
        }
        Arrays.sort(newArray);
        return newArray;
    }

    //O(n) time complexity - O(n) space
    public static int[] sortedSquaredArray2(int[] array) {
        int[] newResult = new int[array.length];
        int startIndex = 0;
        int endIndex = array.length-1;
        for(int i=array.length-1; i>=0; i--) {
            int startValue = array[startIndex];
            int endValue = array[endIndex];
            if(Math.abs(startValue) < Math.abs(endValue)) {
                newResult[i] = endValue * endValue;
                endIndex--;
            } else {
                newResult[i] = startValue * startValue;
                startIndex++;
            }
        }

        return newResult;
    }
}