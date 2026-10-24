package step_week_10;

import java.util.HashSet;
import java.util.Set;

public class PairWithTargetSum {
    static boolean hasPairWithSum(int[] nums, int target) {
        Set<Integer> seen = new HashSet<>();

        for (int number : nums) {
            int complement = target - number;

            if (seen.contains(complement)) {
                return true;
            }

            seen.add(number);
        }

        return false;
    }

    public static void main(String[] args) {
        System.out.println(
            hasPairWithSum(new int[]{2, 7, 11, 15}, 9)
        );

        System.out.println(
            hasPairWithSum(new int[]{3, 4, 6}, 20)
        );
    }
}
