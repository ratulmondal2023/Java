import java.util.Scanner;
public class do_while {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int  a = sc.nextInt();
        int i = 1;
        do{
            System.out.println(i);
            i++;
        }while(i <= a);
        
    }
}

