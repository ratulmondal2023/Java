import java.util.Scanner;
public class App {
    public static void main(String[] args) throws Exception {
        Scanner scan = new Scanner(System.in);
        int a = scan.nextInt();
        int b = scan.nextInt();
        int c = scan.nextInt();
        
        if (a>b) {
            if(a>c){
                System.out.println(a);
            }
        }
        else if (b>c) {
            System.out.println(b);
        }
        else {
            System.out.println(c);
        }
    }
}
