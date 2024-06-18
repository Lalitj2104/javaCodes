
import java.util.*;

public class subtract {

    public static int subtracti(int num1, int num2) {
        int z = num2 - num1;
        return z;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        System.out.println(subtracti(a, b));

    }
}
