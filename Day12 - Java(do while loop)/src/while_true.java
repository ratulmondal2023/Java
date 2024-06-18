import java.util.Scanner;

public class while_true {
    public static void main(String[] args) {
           Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int i = 2;
        int sum = 0;
        while (true) {
            sum+=i;
            i+=2;
            if (i > a) {
                break;
            }
        }
        System.out.println(sum);
    }
}
