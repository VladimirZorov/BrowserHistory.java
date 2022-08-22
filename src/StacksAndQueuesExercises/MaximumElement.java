package StacksAndQueuesExercises;

import java.util.ArrayDeque;
import java.util.Scanner;

public class MaximumElement {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int numbersOfCommands = Integer.parseInt(scanner.nextLine());

        ArrayDeque<Integer> stackNums = new ArrayDeque<>();

        for (int i = 0; i < numbersOfCommands; i++) {
            String[] command = scanner.nextLine().split(" ");

            switch (command[0]) {
                case "1":
                    stackNums.push(Integer.parseInt(command[1]));
                    break;
                case "2":
                    stackNums.pop();
                    break;
                case "3":
                    int  stackNumsMax = Integer.MIN_VALUE;
                    for (Integer num : stackNums){
                        if (num > stackNumsMax){
                            stackNumsMax = num;
                        }
                    }
                    System.out.println(stackNumsMax);
                    break;
            }

        }
    }
}
