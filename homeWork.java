import java.util.Arrays;
import java.util.Scanner;

public class homeWork{
    public static void main(String[] args) {
        // Вычислить n-ое треугольное число(сумма чисел от 1 до n), n! (произведение чисел от 1 до n)
        Scanner iScanner = new Scanner(System.in);
        String endl = System.getProperty("line.separator");
        // System.out.printf("Enter number N: ");
        // int number = Integer.parseInt(iScanner.nextLine());

        // int sum = 0;
        // int factorial = 1;
        // int[] nums = new int[number];
        // for (int i = 0; i < nums.length; i++) {
        //     nums[i] = i + 1;
        //     sum += nums[i];
        //     factorial = factorial * nums[i];
        // }
        // // System.out.println(Arrays.toString(nums));
        // System.out.println("The sum from 1 till N is " + sum + endl);
        // System.out.println("The factorial of N is " + factorial + endl);

        // Вывести все простые числа от 1 до 1000
        int end = 10;
        boolean b = true;
        for (int a = 2; a <= end; a++) {
            for (int i = 2; i < a; i++) {
                if (a % i == 0) {
                    b = false;
                    break;
                }
            }
            if (b) System.out.println(a);
            else b = true;
        }
    }
}