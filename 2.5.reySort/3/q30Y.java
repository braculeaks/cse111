import java.util.Scanner;

public class q30Y {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the length of the array: ");
        int n = sc.nextInt();

        int[] arr = new int[n];

        for (int i = 0; i < n; i++) {
            System.out.print("Enter a number: ");
            arr[i] = sc.nextInt();
        }



        // 1. Reverse using a new array
        int[] arr2 = new int[n];
        for (int i = 0; i < n; i++) {
            arr2[n-1-i] = arr[i];
        }

        System.out.println("Reversed using a new array: ");
            for (int i = 0; i < n; i++) {System.out.println(arr2[i] + " ");}
            System.out.println("");



       
        // 2. Reverse the original array
        int lim = (n-1)/2;
        for (int i = 0; i <= lim; i++) {
            int temp   = arr[i];
            arr[i]     = arr[n-1-i];
            arr[n-1-i] = temp;
        }
    }
}
