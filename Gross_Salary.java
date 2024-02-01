import java.util.*;

public class Employee {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        double basic=sc.nextDouble();
        if(basic <=10000)
        {
            System.out.printf("%.2f",basic+(basic*0.8)+(basic*0.2));
        }
       else if(basic <=20000 && basic>10000)
        {
             System.out.printf("%.2f",basic+(basic*0.9)+(basic*0.25));
        }
        else
        {
            System.out.printf("%.2f",basic+(basic*0.95)+(basic*0.3));
        }
    }
}
