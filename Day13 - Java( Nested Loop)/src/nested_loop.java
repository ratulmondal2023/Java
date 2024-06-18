import java.util.Scanner;
public class nested_loop {
    public static void main(String[] args) {
        Scanner x = new Scanner(System.in);
        int a = x.nextInt();

        for (int i = 1; i <= a; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print(j);
            }
            System.out.println(""); 
        }
        
    }
}
