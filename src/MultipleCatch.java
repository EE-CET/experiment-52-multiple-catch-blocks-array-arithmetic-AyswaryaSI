import java.util.Scanner;
public class MultipleCatch {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
         try {
            int a = sc.nextInt();
            int b = sc.nextInt();

            int result = a / b;
            System.out.print(result);

        } catch (ArithmeticException e) {
            System.out.print("Divide by zero error");
        } catch (Exception e) {
            System.out.print("Invalid index");
        }
    }
}
