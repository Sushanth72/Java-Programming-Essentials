/* Write a Java program to read two integers a and b. Compute a/b and
print, when b is not zero. Raise an exception when b is equal to zero.*/

import java.util.*;

public class Division {
    public static void main(String[] args) {
        int a, b, quotient;
        Scanner s = new Scanner(System.in);
        System.out.println("Enter Numerator:");
        a = s.nextInt();
        System.out.println("Enter Denominator:");
        b = s.nextInt();
        try {
            quotient = a / b;
            System.out.println("Quotient=" + quotient);
        } catch (ArithmeticException ae) {
            System.out.println(ae);
            
        }
    }
}