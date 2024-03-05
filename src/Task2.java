import java.util.Scanner;

public class Task2 {
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        int num = myInt(in);


        System.out.println(num);

    }

    private static int myInt(Scanner pipe) {

        int number = 0;
        String trash = "";

        while (true) {

            System.out.println("Enter a number 1 - 100");

            if (pipe.hasNextInt()) {

                number = pipe.nextInt();

                if (number >=1 && number <= 100) {

                    break;

                }

                else {

                    System.out.println("The number must be between 1 and 100");

                }

            }

            else {

                trash = pipe.nextLine();
                System.out.println("The value must be a number");

            }

        }

        return number;

    }

}
