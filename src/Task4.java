import java.util.Scanner;

public class Task4 {
    public static void main(String[] args) {

        //Variables
        Scanner in = new Scanner(System.in);
        int userNum = 0;
        int total = 1;
        boolean done = false;

        userNum = number(in);

        System.out.println(userNum);

    }

    private static int number(Scanner pipe) {

        int number = 0;
        String trash = "";

        while (true) {

            System.out.println("Enter a number");

            if (pipe.hasNextInt()) {

                number = pipe.nextInt();
                break;

            }

            else {

                trash = pipe.nextLine();
                System.out.println("The input must be a number, you said: " + trash);

            }

        }

        return number;

    }

}
