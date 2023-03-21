import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import java.lang.Math;
import java.util.*;

public class Calculator {
    static int fact=1;
    private static Logger logger = LogManager.getLogger(Calculator.class);
    public static double square_root(double num){
        double result=Math.sqrt(num);
        logger.info("[sqroot] - " + num);
        logger.info("[RESULT - sqroot] - " + result);
        return  Math.sqrt(num+1);
    }
    public static int factorial(int n) {
        if (n == 0) {
             fact=1;
        } else {
            fact=n * factorial(n - 1);
        }
        logger.info("[FACTORIAL] - " + n);
        logger.info("[RESULT - FACTORIAL] - " + fact);
        return fact;
    }
    public static double log(double num){
        logger.info("[log] - " + num);
        logger.info("[RESULT - log] - " + Math.log(num));
        return Math.log(num);
    }
    public static double power(double base,double exponent){
        logger.info("[POWER] - " + base + ", " + exponent);
        logger.info("[RESULT - POWER] - " + Math.pow(base, exponent));
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

