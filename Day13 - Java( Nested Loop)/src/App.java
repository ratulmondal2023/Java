import java.util.Scanner;
public class App {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        for(int i = 1; i <= 10; i++){
            System.out.println("Page NO.   "+ i);
            for(int j = 1; j <= 5; j++){
                System.out.println(j+". This is a Sample Line.");

            }
        }

    }
}
