import java.util.*;

public class PowerOfTwo {
    
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter an integer");
        int n = sc.nextInt();
        
        if(n < 0) {
            System.out.println("Not a power of 2");
        } else {
            int c = 0;
            while (n != 0) {
                c++;
                n = n & (n - 1);
            }
            if (c == 1) {
                System.out.println("Is a power of 2");
            } else {
                System.out.println("Not a power of 2");
            }
        }
    }
}
