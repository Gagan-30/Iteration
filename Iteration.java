/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package iteration;

import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;

/**
 * @author 10373
 */
public class Iteration {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here

        //program1();
        //program2();
        //program3(); //program4 also
        //program5();
        //program6();
        //program7();
        //program8();
        //program9();
        //program10();
        //program11();
        //program12();
        //program13();
        //program14();
        //program15();
        //program16();
        program17();

    }

    private static void program1() {
        for (int i = 0; i < 10; i++) {
            System.out.println(i);
        }

    }

    private static void program2() {

        for (int i = 100; i > 0; i--) {
            System.out.println(i);
        }
    }

    private static void program3() {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter a number: ");
        int k = input.nextInt();
        for (int i = 0; i < k; i += 2) {
            System.out.println(i);
        }
    }

    private static void program5() {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter a number: ");
        int k = input.nextInt();
        System.out.println("Enter a number that you want to stop at: ");
        int j = input.nextInt();
        for (int i = k; i < j; i++) {
            System.out.println(i);
        }
    }

    private static void program6() {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter a number to multiply by: ");
        int k = input.nextInt();
        for (int i = 0; i < 13; i++) {
            System.out.println(i * k);
        }
    }

    private static void program7() {

        Scanner input = new Scanner(System.in);

        double total = 0;
        for (int i = 0; i < 5; i++) {
            System.out.println("Enter a number: ");
            double k = input.nextDouble();
            total = total + k;
        }
        System.out.println("Average: " + total / 5);
    }

    private static void program8() {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter a number");
        int n = input.nextInt();
        while (n >= 0) {
            System.out.println(n);
            n = n - 1;
        }
        System.out.println("We have Lift off");
    }

    private static void program9() {
        int x = 0;
        while (x < 21) {
            System.out.println(x + "" + Math.log(x));
            x = x + 1;
        }

    }

    private static void program10() {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter a number");
        int x = input.nextInt();
        if ((x % 2) == 0) {
            System.out.println("x is even");
            while (x > 1) {
                x = x / 2;
                System.out.println("x = " + x);
            }
        } else {
            System.out.println("x is odd");
        }
    }

    private static void program11() {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter a number");
        int x = input.nextInt();
        System.out.println("Enter a number");
        int y = input.nextInt();
        while (x > 0) {
            x = x - 1;
            System.out.println("x = " + x);
            if ((x - y) == 0) {
                break;
            }
        }
    }

    private static void program12() {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter a number");
        int n = input.nextInt();
        do {
            System.out.println(n);
            n = n - 1;
        } while (n > 1);

        System.out.println("We have Lift off");
    }

    private static void program13() {
        int x = 0;
        do {
            System.out.println(x + "" + Math.log(x));
            x = x + 1;
        } while (x < 21);

    }

    private static void program14() {
        Scanner input = new Scanner(System.in);
        String name;
        do {
            System.out.println("Enter a name");
            name = input.nextLine();
            System.out.println("Howdy " + name);
        } while (!"quit".equals(name));

    }

    private static void program15() {

        Scanner input = new Scanner(System.in);
        String password;
        String guessword = "password123";
        int tries = 3;
        do {
            System.out.println("Enter a password");
            password = input.nextLine();
            tries = tries - 1;
            System.out.println("password is " + password);
            System.out.println("tries = " + tries);
            if (tries == 0) {
                System.out.println("Locked out");
                System.exit(0);
            }
        } while (!password.equals(guessword));
        System.exit(0);
    }

    private static void program16() {
        Scanner input = new Scanner(System.in);
        Random rand = new Random();

        int number = rand.nextInt(100);
        int correct = 0;
        int count = 1;
        System.out.println("Enter a number between 1 and 100");
        do {
            int guess = input.nextInt();
            if (guess == number) {
                System.out.println("Correct - Well Done");
                correct = 1;
            } else if (guess < number) {
                System.out.println("Too Low");
            } else {
                System.out.println("Too High");
            }
            count = count + 1;
        } while (count < 11 & correct == 0);
        System.out.println("The number was " + number);
    }

    private static void program17() {
        Scanner input = new Scanner(System.in);

        String fan;
        int g = 0;
        int k = 0;

        ArrayList<String> people = new ArrayList<String>();

        do {
            System.out.println("Enter [g / k]: ");
            fan = input.nextLine();
            if (fan.contains("g")) {
                people.add(fan);
                g = g + 1;
            } else if (fan.contains("k")) {
                people.add(fan);
                k = k + 1;
            } else if (fan.contains("x")) {
                System.out.println("goth = " + g);
                System.out.println("k-pop = " + k);
                break;
            }

            System.out.println(people);
        } while (fan != null);
        System.exit(0);


    }


}
