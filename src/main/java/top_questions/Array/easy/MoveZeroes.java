package top_questions.Array.easy;

/*
* Given an array nums, write a function to move all 0's to the end of it while maintaining the relative order of the non-zero elements.
*   You must do this in-place without making a copy of the array.
    Minimize the total number of operations.
    *
    *   Input: [0,1,0,3,12]
        Output: [1,3,12,0,0]
* */
public class MoveZeroes {

    public static void main(String[] args) {
        int[] arr = {0, 1, 0, 3, 12};

        moveZeroes(arr);

        // Print updated array
        for (int value : arr) System.out.print(value + " ");
    }

    private static void moveZeroes(int[] arr) {
        int n = arr.length;

        int j = 0;
        for (int i = 0; i < n; i++) {
            if (arr[i] != 0) {
                arr[j] = arr[i];
                j++;
            }
        }

        for (int i = j; i < n; i++) {
            arr[i] = 0;
        }

    }
}
