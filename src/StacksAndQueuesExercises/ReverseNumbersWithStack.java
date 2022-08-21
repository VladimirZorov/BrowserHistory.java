package StacksAndQueuesExercises;

import java.util.ArrayDeque;
import java.util.Scanner;

public class ReverseNumbersWithStack {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        ArrayDeque<Integer> nums = new ArrayDeque<>();
        String[] input = scanner.nextLine().split(" ");

        for (String inp : input) {
            nums.push(Integer.valueOf(inp));
        }

        for (Integer num : nums) {
            System.out.print(nums.pop( )+ " ");
        }
    }
}
