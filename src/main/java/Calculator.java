import java.lang.Math;
import java.util.*;

public class Calculator {
    public static double square_root(double num){
        return  Math.sqrt(num);
    }
    public static int factorial(int n) {
        if (n == 0) {
            return 1;
        } else {
            return n * factorial(n - 1);
        }
    }
    public static double log(double num){
        return Math.log(num);
    }
    public static double power(double base,double exponent){
        return Math.pow(base, exponent);
    }
    public static void main(String[] args){

        Scanner sc=new Scanner(System.in);
        System.out.println("0. Square root");
        System.out.println("1. Factorial");
        System.out.println("2. Log");
        System.out.println("3. Pow");
        int input=sc.nextInt();
        switch (input) {
            case 0:
                System.out.print("Enter a number: ");
                double sqrt_num = sc.nextDouble();
                double sqrt_result = square_root(sqrt_num);
                System.out.println("Square root of " + sqrt_num + " is " + sqrt_result);
                break;

            case 1:
                System.out.print("Enter a number: ");
                int fact_num = sc.nextInt();
                int fact_result = factorial(fact_num);
                System.out.println(fact_num + "! is " + fact_result);
                break;

            case 2:
                System.out.print("Enter a number: ");
                double ln_num = sc.nextDouble();
                double ln_result = log(ln_num);
                System.out.println("Natural logarithm of " + ln_num + " is " + ln_result);
                break;

            case 3:
                System.out.print("Enter the base: ");
                double base = sc.nextDouble();
                System.out.print("Enter the exponent: ");
                double exponent = sc.nextDouble();
                double pow_result = power(base, exponent);
                System.out.println(base + "^" + exponent + " is " + pow_result);
                break;

            default:
                System.out.println("Invalid choice");
        }
    }

}

