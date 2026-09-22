import java.util.Scanner;

public class q30X {
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.print("N = ");

        int n;
        n = sc.nextInt();



        int[] arr = new int[n];         // 700-750

        for (int i = 0; i < n; i++) {
            System.out.print("Enter a number: ");
            int k = sc.nextInt();
            arr[i] = k;
        }



        System.out.println("The elements of the array are: ");
        for (int i = 0; i < n; i++) {
            System.out.println(i + ": " + arr[i]);
        }



        int x;
        System.out.print("Enter another number: ");
        x = sc.nextInt();



        // ReSize: arr by length 1
        int[] arr2 = new int[n+1];      // 800-860

        for (int i = 0; i < n; i++) {
            arr2[i] = arr[i];
        }

        // Insert new
        arr2[n] = x;
            System.out.println("After resizing the array:");

        for (int i = 0; i < n+1; i++) {
            System.out.print( arr2[i] + " ");
        }
    }
}
