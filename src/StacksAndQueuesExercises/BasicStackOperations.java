package StacksAndQueuesExercises;

import java.util.ArrayDeque;
import java.util.Scanner;

public class BasicStackOperations {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String[] commands = scanner.nextLine().split(" ");

        ArrayDeque<Integer> numbersStack = new ArrayDeque<>();

        int numsOfElementToPush = Integer.parseInt(commands[0]);
        int numsOfElementToPop = Integer.parseInt(commands[1]);
        int elementToCheck = Integer.parseInt(commands[2]);

        String[] nums = scanner.nextLine().split(" ");

        for (int i = 0; i < numsOfElementToPush; i++) {
            numbersStack.push(Integer.parseInt(nums[i]));
        }

        for (int i = 0; i < numsOfElementToPop; i++) {
            numbersStack.pop();
        }

        if (numbersStack.isEmpty()){
            System.out.println("0");
        }

        for (Integer number : numbersStack) {
            if (elementToCheck == number) {
            }
        }

        if (isExist){
            System.out.println("true");
        } else {

        }

    }
}
