
import java.util.Scanner;
public class LoopQ2 {
    public static void main(String args[]){

        int fact=1;
        System.out.println("Enter the N for Factorial: ");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        if(n>0)
       { for(int i=1; i<=n; i++){
            int m=i;
            fact=fact*m;

        }
        System.out.println("Factorial of " +n+ " is: "+fact);
        }
        else if (n<0) {
            System.out.println("Invalid");
        }
        else
        {
            System.out.println("Factorial is 1");
        }
    }
}
