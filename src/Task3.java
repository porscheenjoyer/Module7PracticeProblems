import java.util.Scanner;

public class Task3 {
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        //Variables
        double investment = 0;
        double total = 0;
        double twoXInvest = 0;
        double years = 0;
        double INTEREST = 1.0005;
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

        //Math
        total = investment + INTEREST;
        twoXInvest = investment * 2;

        //Loop
        do {

            total = total * INTEREST;
            years = years + 1;

        } while (total < twoXInvest);

        System.out.println("The time taken to double your investment is: " + years + " years");

    }
}
