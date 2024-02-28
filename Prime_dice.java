import java.util.*;
public class Game {
    public static boolean isPrime(int n) {
        if (n <= 1)
            return false;
        for (int i = 2; i <= Math.sqrt(n); i++) {
            if (n % i == 0)
                return false;
        }
        return true;
    }

    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt(); 

        for (int t = 0; t < T; t++) {
            int A = sc.nextInt(); 
            int B = sc.nextInt(); 
            int sum = A + B; 
            if (isPrime(sum))
                System.out.println("tevitt"); 
            else
                System.out.println("Satya");
    }
}
}
