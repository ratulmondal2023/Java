import java.util.Scanner;
public class hunt_the_num {
    public static void main(String[] args) {
        Scanner anon = new Scanner(System.in);
        System.out.println("How Many Inputs You Want: ");
        int k = anon.nextInt();
        int [] arr = new int[k];
        System.out.println("Input Your " +k+"th Digits: ");
        for (int i = 0; i < arr.length; i++) {
            arr[i] = anon.nextInt();
        }
        int b = arr[0];
        for (int i = 0; i < arr.length; i++) {
            if (b < arr[i]) {
                b = arr[i];
            }
        }
        System.out.println("Your Maximum Value: "+b);
    }
}
