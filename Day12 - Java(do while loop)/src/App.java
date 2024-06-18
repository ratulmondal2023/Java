import java.util.Scanner;
public class App {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int i = 2;
        int sum = 0;
        while (i<=a) {
            sum+=i;
            i+=2;
        }
        System.out.println(sum);
        
    }
}
