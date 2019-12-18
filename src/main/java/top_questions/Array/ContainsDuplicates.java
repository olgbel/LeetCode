package top_questions.Array;
/*
    Given an array of integers, find if the array contains any duplicates.

    Your function should return true if any value appears at least twice in the array, and it should return false if every element is distinct.
* */

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class ContainsDuplicates {

    public static void main(String[] args){
//        int[] arr = {1,1,1,3,3,4,3,2,4,2};
        int[] arr = {1,2,3,4};
//        int[] arr = {1,2,3,1};

//        boolean isContainsDuplicates = containsDuplicate(arr);
        boolean isContainsDuplicates = containsDuplicates2(arr);

        System.out.println(isContainsDuplicates);
    }

    public static boolean containsDuplicate(int[] nums) {
        Arrays.sort(nums);
        for (int i = 0; i < nums.length - 1; i++){
            if (nums[i] == nums[i + 1])
                return true;
        }
        return false;
    }

    public static boolean containsDuplicates2(int[] nums){
        Set<Integer> set = new HashSet<>(nums.length);
        for (int x: nums){
            if (set.contains(x)) return true;
            set.add(x);
        }

        return false;
    }
}
