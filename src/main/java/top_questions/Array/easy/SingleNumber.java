package top_questions.Array.easy;

import java.util.HashMap;
import java.util.Map;

/* Given a non-empty array of integers, every element appears twice except for one. Find that single one. */
public class SingleNumber {

    public static void main(String[] args) {
        int[] arr = {3,1,2,3,1};

        int n = singleNumber(arr);
        System.out.println("\n" + n);
        /*
        *   1 1 2 2 4

            1 2 2 3 3

            1 1 2 3 3
        * */
    }

    private static int singleNumber(int[] nums) {

        HashMap<Integer, Integer> map = new HashMap<>();
        for (int n : nums){
            if (map.containsKey(n))
                map.put(n, 2);

            map.putIfAbsent(n, 1);
        }

        for (Map.Entry<Integer, Integer> entry : map.entrySet()){
            System.out.println(entry.getKey() + " " + entry.getValue());
            if (entry.getValue() == 1)
                return entry.getKey();
        }

        return 0;
    }
}

