/*
 * Kaune
 * Sept.12/19
 * A scanner example and GitHub first push test
 */

package scannertest;
import java.util.Scanner;

/**
 *
 * @author rkaune
 */
public class ScannerTest {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        final double PIE =3.14;
        Scanner input = new Scanner(System.in);
        //PIE=1.7;
        String name;
        int age;
        System.out.print("What is your name? ");
        name = input.nextLine();
        System.out.print("What is your age? ");
        age = input.nextInt();
        System.out.println("My name is " + name);
        System.out.println("My age is " + age);
        input.close();
    }
    
}
