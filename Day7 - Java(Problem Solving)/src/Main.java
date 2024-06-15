import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner scan  = new Scanner(System.in);
        int X = scan.nextInt();
        for (int i = 1; i <= X; i += 2) {
            System.out.println(i);
        }
    }

}