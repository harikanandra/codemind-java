import java.util.*;

public class Prime {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int r = sc.nextInt();
        int count = 0;

        for (int j = n; j <= r; j++) {
            int c = 0; // Reset c to 0 for each number
            for (int i = 1; i <= j; i++) {
                if (j % i == 0)
                    c += 1;
            }
            if (c == 2)
                count += 1;
        }
        System.out.println(count);
    }
}
