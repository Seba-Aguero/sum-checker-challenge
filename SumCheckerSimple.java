/*
Solución simple: utilizando dos bucles anidados.
Para cada elemento, revisa si hay otro que complete la suma requerida.
Esta solución tiene una complejidad O(n^2).
*/

import java.util.*;

public class SumCheckerSimple {
    public static boolean hasPairWithSum(int[] nums, int requiredSum) {
        for (int i = 0; i < nums.length; i++) {
            for (int j = i + 1; j < nums.length; j++) {
                if (nums[i] + nums[j] == requiredSum) {
                    return true;
                }
            }
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