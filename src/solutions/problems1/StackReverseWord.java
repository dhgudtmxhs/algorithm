package solutions.problems1;

import java.util.Scanner;


public class StackReverseWord {


        public static void reverseWords() {
            Scanner scanner = new Scanner(System.in);

            int n = scanner.nextInt();
            scanner.nextLine();

            for (int i = 1; i <= n; i++) {
                String line = scanner.nextLine();
                String[] words = line.split(" ");

                StringBuilder reversedLine = new StringBuilder();
                for (int j = words.length - 1; j >= 0; j--) {
                    reversedLine.append(words[j]);
                    if (j > 0) {
                        reversedLine.append(" ");
                    }
                }

                System.out.println("Case #" + i + ": " + reversedLine.toString());
            }

            scanner.close();
        }
}
