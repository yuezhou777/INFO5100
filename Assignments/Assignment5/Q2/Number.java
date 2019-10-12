import java.util.*;

public class Number {

    public static void main(String[] args) {
        count();
    }
     
    public static void count() {
        Scanner scanner = new Scanner(System.in);
        try {
            System.out.println("Please enter first number (numerator): ");
            int firstNum = scanner.nextInt();
            System.out.println("Please enter second number (denominator): ");
            int secondNum = scanner.nextInt();
            System.out.println("The quotient is: " + firstNum / secondNum);
        } catch (ArithmeticException e) { 
            System.out.println("Denominator should not be zero");
            e.printStackTrace();
        } catch (InputMismatchException e) {
            System.out.println("Please enter number as integer");
            e.printStackTrace();
        } catch (Exception e) {
            System.out.println("Mistake occurred");
            e.printStackTrace();
        } finally {
            System.out.println("Method Ended");
        }
    }

}