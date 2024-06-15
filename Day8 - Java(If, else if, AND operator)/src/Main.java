import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner anon  = new Scanner(System.in);
        int a = anon.nextInt();
        int b = anon.nextInt();
        int c = anon.nextInt();

        if (a > b && a > c) {
            System.out.println(a);
        }
        else if (b > a && b > c) {
            System.out.println(b);
        }
        else{
            System.out.println(c);
        }
    }
}