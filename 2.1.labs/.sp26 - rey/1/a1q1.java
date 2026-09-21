import java.util.Scanner;

public class a1q1 {
    public static boolean IsPrime(int k) 
    {
        boolean isPrime = true;
        for (int i = 2; i < k; i++) {
            if (k%i == 0) {
                isPrime = false;
                break;
            }
        }

        return isPrime;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int l = sc.nextInt();
        int r = sc.nextInt();
        int ans = 0;

        if (l > r) {
            int tmp = l;
                l   = r;
                r   = tmp;
        }

        for (int k = l+1; k < r; k++) {     // "between" = "not-inclusive"
            if (IsPrime(k) == true) ans++;
        }

        System.out.println(
            "There are " + ans + " prime numbers between " 
                + l + " and " 
                + r + "."
            );
    }
}