package top_questions.Array.easy;
/*
    Given a sorted array nums, remove the duplicates in-place such that each element appear only once and return the new length.
    Do not allocate extra space for another array, you must do this by modifying the input array in-place with O(1) extra memory.
* */

public class RemoveDuplicates {

    public static void main(String[] args){
        int[] arr = {1, 2, 2, 3, 4, 4, 4, 5, 5};

        int n = removeDuplicates(arr);

        // Print updated array
        for (int i = 0; i < n; i++)
            System.out.print(arr[i] + " ");
    }

    private static int removeDuplicates(int[] nums) {

        int n = nums.length;
        if (n < 2){
            return n;
        }
        int j = 0;

        for (int i = 0; i < n-1; i++)
            if (nums[i] != nums[i+1])
                nums[j++] = nums[i];

        nums[j++] = nums[n-1];

        return j;
    }
}
