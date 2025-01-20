package codinggames;

import java.util.Scanner;

public class TreasureHunt {
    public void helloWorld() {
        System.out.print("Hello World");
    }

    public void hunt() {
        Scanner in = new Scanner(System.in);
        int H = in.nextInt();
        int W = in.nextInt();
        if (in.hasNextLine()) {
            in.nextLine();
        }
        for (int i = 0; i < H; i++) {
            String row = in.nextLine();
        }

        // Write an answer using System.out.println()
        // To debug: System.err.println("Debug messages...");

        System.out.println("answer");
    }

}
