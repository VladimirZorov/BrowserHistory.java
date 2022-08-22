package StacksAndQueuesExercises;

import java.util.ArrayDeque;
import java.util.Scanner;

public class BasicQueueOperations {
    public static void main(String[] args) {
        Scanner scanner= new Scanner(System.in);

        String [] input = scanner.nextLine().split(" ");

        int numsOfElements = Integer.parseInt(input[0]);
        int removedElements = Integer.parseInt(input[1]);
        int elementToCheck = Integer.parseInt(input[2]);

        ArrayDeque<Integer> numbersQueue = new ArrayDeque<>();

        String [] numbers = scanner.nextLine().split(" ");

        for (String num : numbers) {
            numbersQueue.add(Integer.parseInt(num));
        }
        for (int i = 0; i < removedElements; i++) {
            numbersQueue.pop();
        }

        if(numbersQueue.isEmpty()){
            System.out.println("0");

        }
        int minElementOfNumbersQueue = Integer.MAX_VALUE;

        for (Integer nums: numbersQueue) {
            if (nums < minElementOfNumbersQueue) {
                minElementOfNumbersQueue = nums;
            }
        }
        for(Integer nums : numbersQueue) {

            if (nums==elementToCheck) {
                System.out.println("true");
            }
        }


    }
}
