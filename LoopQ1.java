
import java.util.*;

public class LoopQ1 {

    public static void main(String args[]){
       
        int[] A= new int[5]; 
        for(int i=0; i<5;i++){ 
        System.out.println("Enter the number "+i+":");
        Scanner sc= new Scanner(System.in);
        A[i] = sc.nextInt();
        }

        int sum=0;
        for(int i=0; i<5;i++){
            int last = A[i];
            sum=last+sum;
        }

        System.out.println("Sum is: "+sum);
        
    }
}
