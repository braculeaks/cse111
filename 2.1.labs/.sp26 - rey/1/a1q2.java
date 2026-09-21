import java.util.Scanner;

public class a1q2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        String s = sc.next();

        for (int i = 0, len = s.length(); i < len; i++) 
        {
            char c = s.charAt(i);

                 if (c == 'a') c = 'z';
            else if (c == 'A') c = 'Z'; 
            else               c = (char) (s.charAt(i) - 1);            
            
            System.out.print(c);
        }
        System.out.print('\n');
    }
}
