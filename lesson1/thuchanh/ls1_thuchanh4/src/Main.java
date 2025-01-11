import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int a,b,c;

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a: ");
        a = sc.nextInt();
        sc.nextLine();

        System.out.println("Enter b: ");
        b = sc.nextInt();
        sc.nextLine();

        System.out.println("Enter c: ");
        c = sc.nextInt();
        sc.nextLine();

        if (a != 0 ) {
            double answer = (double)(c - b) / a;
            System.out.printf("x = %f" , answer);
        }
            else {
                if (b ==c ) {
                    System.out.println("the solution is all x");
                }
                else {
                    System.out.println("no solution");
                }
            }



    }
}