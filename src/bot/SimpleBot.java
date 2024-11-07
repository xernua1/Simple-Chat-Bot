package bot;

import java.util.Arrays;
import java.util.Scanner;

public class SimpleBot {
    public static void greeting(Scanner scanner) {

        System.out.println("Hello! My name is Aid.");
        System.out.println("I was created in 2023.");
        System.out.println("Please, remind me your name.");

        // reading a name
        System.out.println("What a great name you have, " + scanner.nextLine() + "!");
    }

    public static void guessAge(Scanner scanner) {
        System.out.println("Let me guess your age.");
        System.out.println("Enter remainders of dividing your age by 3, 5 and 7.");
        int[] remainders = {0, 0, 0};
        for (int i = 0; i < remainders.length; i++) {
            remainders[i] = Integer.parseInt(scanner.nextLine());
        }
        remainders[0] *= 70;
        remainders[1] *= 21;
        remainders[2] *= 15;
        int age = (Arrays.stream(remainders).sum()) % 105;
        System.out.println("Your age is " + age + " that's a good time to start programming!");
    }

    public static void count(Scanner scanner)
    {
        System.out.println("Now I will prove to you that I can count to any number you want.");
        int max = scanner.nextInt();
        for (int i = 0; i <= max; i++) {
            System.out.println(i + "!");
        }
        System.out.println("Completed, have a nice day!");
    }
    public static void quiz(Scanner scanner)
    {
        System.out.println("Let's test your programming knowledge. \nWhich of the following packages are imported by default" +
                "in all the classes of Java? (There might be multiple correct answers)");
        System.out.println("1. java.lang\n2. No packages are included by default\n3. java.awt\n4. java.io\n5. a no-name package(also called the default package)\n" +
                "6. java.math\n7. java.util\n8. java.print");
        int answer = 0;
        answer=scanner.nextInt();
        while (answer != 1 && answer != 5)
        {
            System.out.println("Please try again.");
            answer=scanner.nextInt();
        }
        System.out.println("Congratulations, have a nice day!");
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        greeting(scanner);
        guessAge(scanner);
        count(scanner);
        quiz(scanner);
    }
}
