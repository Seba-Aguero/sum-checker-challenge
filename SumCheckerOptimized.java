/*
Solución eficiente: utilizando un HashSet para recordar complementos.
Para cada elemento, revisa si su complemento (requiredSum - num) ya fue visto.
Esta solución tiene una complejidad O(n).
*/

import java.util.*;

public class SumCheckerOptimized {
    public static boolean hasPairWithSum(int[] nums, int requiredSum) {
        Set<Integer> seen = new HashSet<>();

        for (int num : nums) {
            int complement = requiredSum - num;
            if (seen.contains(complement)) {
                return true;
            }
            seen.add(num);
        }

        return false;
    }

    // Tests
    public static void main(String[] args) {
        int[] nums1 = { 1, 4, 3, 9 };
        int sum1 = 8;
        System.out.println("¿Existe un par en " + Arrays.toString(nums1) + " cuya suma sea " + sum1 + "? " +
                (hasPairWithSum(nums1, sum1) ? "Sí" : "No")); // No (false)

        int[] nums2 = { 1, 2, 4, 4 };
        int sum2 = 8;
        System.out.println("¿Existe un par en " + Arrays.toString(nums2) + " cuya suma sea " + sum2 + "? " +
                (hasPairWithSum(nums2, sum2) ? "Sí" : "No")); // Sí (true)
    }
}