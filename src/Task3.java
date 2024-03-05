import java.util.Scanner;

public class Task3 {
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        //Variables
        double investment = 0;
        double total = 0;
        double twoXInvest = 0;
        int years = 0;
        double INTEREST = 1.005;
        boolean done = false;
        String trash = " ";

        //Loop
        do {

            System.out.println("What is your initial investment");

            if (in.hasNextDouble()) {

                investment = in.nextDouble();
                done = true;

            }

            else {

                trash = in.nextLine();
                System.out.println("Input must be a number, you said: " + trash);

            }

        } while (!done);

        total = investment + INTEREST;

        do {

            total = total

        } while (total < twoXInvest);

    }
}
