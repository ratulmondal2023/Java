import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner as = new Scanner(System.in);
        int a = as.nextInt();
        int b = as.nextInt();
        if(a%2==0){
            System.out.println("Even");
        }
        else {
            System.out.println("Odd");
        }
        switch (b%2){
            case 0 -> System.out.println("Even");
            case 1 -> System.out.println("Odd");
            default -> System.out.println("This is 0");

        }
    }
}