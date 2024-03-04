public class Task1 {
    public static void main(String[] args) {

        //Variables
        int sum = 2;

        //Loop
        for (int number = 2; number <= 100; number += 2) {

            sum = sum + number;

        }

        System.out.println("The sum of all even numbers 1 - 100 is: " + sum);
    }
}