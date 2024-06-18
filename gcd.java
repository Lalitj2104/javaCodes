
public class gcd {

    // Method to compute GCD using the Euclidean algorithm
    public static int computeGCD(int a, int b) {
        // Ensure that a and b are non-negative
        if (a < 0) {
            a = -a;
        }
        if (b < 0) {
            b = -b;
        }

        // Implementing the Euclidean algorithm
        while (b != 0) {
            int temp = b;
            b = a % b;
            a = temp;
        }
        return a;
    }

    public static void main(String[] args) {
        int num1 = 56;
        int num2 = 98;

        // Call the computeGCD method and print the result
        int gcd = computeGCD(num1, num2);
        System.out.println("The GCD of " + num1 + " and " + num2 + " is: " + gcd);
    }
}
