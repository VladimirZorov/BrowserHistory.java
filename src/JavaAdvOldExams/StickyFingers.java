package JavaAdvOldExams;

import java.io.IOException;
import java.util.Scanner;

public class StickyFingers {
    public static void main(String[] args) throws IOException {

        Scanner scanner = new Scanner(System.in);

        int rowIndex = 0;
        int colIndex = 0;


        int fieldSize = Integer.parseInt(scanner.nextLine());
        String[] commands = scanner.nextLine().split(",");

        String[][] field = new String[fieldSize][fieldSize];

        for (int i = 0; i < fieldSize; i++) {
            String[] row = scanner.nextLine().split(" ");
            for (int j = 0; j < fieldSize; j++) {
                field[i][j] = row[j];

                if (field[i][j].equals("D")) {
                    rowIndex = i;
                    colIndex = j;
                }
            }
        }
        int totalMoney = 0;
        boolean caught = false;

        for (int i = 0; i < commands.length; i++) {
            switch (commands[i]) {
                case "up":
                    if (rowIndex - 1 >= 0) {
                        field[rowIndex][colIndex] = "+";
                        rowIndex--;
                    } else {
                        System.out.println("You cannot leave the town, there is police outside!");
                    }
                    break;
                case "down":
                    if (rowIndex + 1 < fieldSize) {
                        field[rowIndex][colIndex] = "+";
                        rowIndex++;
                    } else {
                        System.out.println("You cannot leave the town, there is police outside!");
                    }
                    break;
                case "left":
                    if (colIndex - 1 >= 0) {
                        field[rowIndex][colIndex] = "+";
                        colIndex--;
                    } else {
                        System.out.println("You cannot leave the town, there is police outside!");
                    }
                    break;
                case "right":
                    if (colIndex + 1 < fieldSize) {
                        field[rowIndex][colIndex] = "+";
                        colIndex++;
                    } else {
                        System.out.println("You cannot leave the town, there is police outside!");
                    }
                    break;
            }



        if (field[rowIndex][colIndex].equals("P")) {
            System.out.printf("You got caught with %d$, and you are going to jail.%n", totalMoney);
            field[rowIndex][colIndex] = "#";
            caught = true;
            break;
        }
        if (field[rowIndex][colIndex].equals("$")) {
            System.out.printf("You successfully stole %d$.%n", rowIndex * colIndex);
            totalMoney += rowIndex * colIndex;

        }
        field[rowIndex][colIndex] = "D";

    }
        if(!caught)

    {
        System.out.printf("Your last theft has finished successfully with %d$ in your pocket.%n", totalMoney);
    }

        for(
    int i = 0;
    i<fieldSize;i++)

    {
        System.out.println(String.join(" ", field[i]));
    }
}
}