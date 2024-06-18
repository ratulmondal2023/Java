import java.util.Scanner;
public class oneD_array {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int [] x = new int[4];
        for (int i = 0; i < x.length; i++) {
            x[i] = sc.nextInt();
        }



        /*int [] x;           Program #2
        x = new int[] {22, 44};
        for (int i = 0; i < x.length; i++) {
            System.out.println(x[i]);
        }*/

        /*int [] x = new int[2];   Program #3
        x [0] = 44;
        x [1] = 22;
        */for (int i = 0; i < x.length; i++) {
            System.out.println(x[i]);
        }


    }
    
}
