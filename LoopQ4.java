public class LoopQ4 {


    public static void loop1(){
        for(int i=0; i<5; i++){
            for(int j=0;j<i;j++){
                System.out.print("*");
            }
            System.out.println(" ");
        }
    }

    public static void loop2(){
        for(int i=4; i>0; i--){
            for(int j=0;j<i;j++){
                System.out.print("*");
            }
            System.out.println(" ");
        }
    }

    public static void loop3(){
        for(int i=0; i<5; i++){
            for(int j=1;j<i+1;j++){
                System.out.print(j);
            }
            System.out.println(" ");
        }
    }
    public static void loop4() {
    for (int i = 0; i < 5; i++) {
        for (int j = 0; j <= i; j++) {
            char ch = (char) ('A' + j);  // Convert number to char
            System.out.print(ch);
        }
        System.out.println();  // Move to next line
    }
}


    public static void main(String args[]){
        
        loop4();
    }
    
}
