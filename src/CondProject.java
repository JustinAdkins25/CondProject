import java.util.Scanner;

public class CondProject {




    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        double x1, x3, x2, x4;

        double average;
        double multiplication;
        double division;
        double subtraction;
        System.out.println("Enter a value for A: ");
        x1 = scan.nextDouble();
        System.out.println("Enter a value for B: ");
        x2 = scan.nextDouble();
        System.out.println("Enter a value for C: ");
        x3 =  scan.nextDouble();
        System.out.println("Enter a value for D: ");
        x4 = scan.nextDouble();


        average = sum(x1, x2, x3, x4);
        System.out.println(" " + x1 + " + "+ x2 +" + " + x3 + " + " + x4 + " = " + (int) average);


        multiplication = multiply(x1,x2,x4);
        System.out.println("" + x1 +" * " + x2 + " * " + x4 + " = " + (int)multiplication);

        division = divide(x2,x4);
        System.out.println(" " + x2 +" / " + x4 +" = " + division);

        subtraction = subtract(x3,x2);
        System.out.println("" + x2 +" - " + x3 +" = " + (int)subtraction);





    }

    public static double sum(double a , double b, double c, double d) {

        double result = a + b + c + d;

        return result;
    }

    public static double multiply(double a, double b, double d){

        double result = (a * b * d);

        return result;
    }

    public static double divide(double b, double d){

        double result = b / d;

        return result;

    }
    public static double subtract(double c , double b){
        double result = b - c;

        return result;
    }

}
