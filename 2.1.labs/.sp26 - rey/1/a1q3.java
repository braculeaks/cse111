import java.util.Scanner;

public class a1q3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = 0;
            System.out.print("N = ");
            n = sc.nextInt();
        
        int    [] arr  = new int[n];
        boolean[] done = new boolean[n];
            for (int i = 0; i < n; i++) 
            {
                arr[i] = sc.nextInt();
                done[i] = false;
            }

        for (int i = 0; i < n; i++) 
        {
            int x = arr[i];
            if (done[i] == true) {continue;}
            else {
                int count = 1;
                    done[i] = true;

                for (int j = i+1; j < n; j++) {
                    if (arr[j] == x) {
                        count ++;
                        done[j] = true;
                    }
                }

                System.out.println(x + " - " + count + " times");
            }
        }
    }
}
