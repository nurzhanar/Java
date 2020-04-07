import java.util.Scanner;
public class Main {
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        System.out.print("Input a salary: ");
        float salary = in.nextFloat();
        double pension = salary * 0.1;
        double tax = (salary - pension - 42500) * 0.1;
        double total;
        total = salary - (pension + tax);
        System.out.print("Your total salary: ");
        System.out.print(total);
    }
}