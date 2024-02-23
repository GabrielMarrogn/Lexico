import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String[] arr= new String[2];

        arr[0] =sc.nextLine();
        arr[1] =sc.nextLine();

        Arrays.sort(arr);

        for (String p : arr) {
            System.out.println(p);
        }

        sc.close();
    }

}
