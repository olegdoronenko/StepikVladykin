/*
Урок 2.4 определение факториала числа
 */
import java.math.*;
import java.util.Scanner;
public class Factorial {
    public static void main (String[] args){
        Scanner input = new Scanner(System.in);
        System.out.print("введите число: ");
        int ourValue = input.nextInt();
        System.out.println(factorial(ourValue));

    }
    public static BigInteger factorial(int value) {
        if (value == 0) {
            return BigInteger.valueOf(1);
        } else {
            BigInteger number =  BigInteger.valueOf(1);
            for (int i = 1; i <= value; i++) {
                number = number.multiply(BigInteger.valueOf(i));
            } return number;

        }




       // BigInteger number = BigInteger.valueOf(value);
       // int result = 1;
        //for (int i = 1; i <= value; i++) {
          //  result = result * i;
        //}

         // your implementation here
    }

}
