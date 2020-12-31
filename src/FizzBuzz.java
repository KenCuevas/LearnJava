import java.util.Scanner;
public class FizzBuzz {
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);

        int readNumber;

        System.out.println("Enter a number: ");
        readNumber = sc.nextInt();

        if (readNumber % 3 == 0 && readNumber % 5 == 0)
            System.out.println("FizzBuzz");
        else if (readNumber % 3 == 0)
            System.out.println("Buzz");
        else if (readNumber % 5 == 0)
            System.out.println("Fizz");
        else
            System.out.println(readNumber);
    }
}
