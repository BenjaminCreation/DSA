


public class LoopAdvPattern {
    
    public static void hollowRectPattern(int rows, int col){
        
        for(int i=1; i<=rows; i++){
            for(int j=1; j<=col; j++){
                if (i==1 || i==rows || j==1 || j==col){
                    System.out.print("*");
                } else{
                    System.out.print(" ");
                }
            }
        System.out.println();
        }
    }


    public static void InvrHalfPyramid(int rows){
        for(int i=1; i<=rows; i++){
            for(int j=1; j<=rows-i; j++){
                System.out.print(" ");
            }
            
            for( int j=1; j<=i; j++){
                System.out.print("*");
            }
            
            System.out.println("");
        }
    }

     public static void InvrHalfPyramidNumbers(int rows){
        for(int i=1; i<=rows; i++){
            //Numbers
            for(int j=1; j<=rows-i+1; j++){
                System.out.print(j);
            }
            System.out.println("");
        }
    }
    public static void FLyodsTri(int rows){
        int n=1;
        for(int i=1; i<=rows; i++){
            //Numbers
            for(int j=1; j<=i; j++){
                System.out.print(n+" ");
                n++;
            } 
            System.out.println(" ");
        }
    }

    public static void ZeroOneTri(int rows){
        for(int i=1; i<=rows; i++){
            //Numbers
            for(int j=1; j<=i; j++){
                if(i%2 == 0 ){
                    if (j%2 !=0){
                        System.out.print("0 ");
                    }

                    else {
                        System.out.print("1 ");
                    }
                }

                else {
                    if (j%2 !=0){
                        System.out.print("1 ");
                    }

                    else {
                        System.out.print("0 ");
                    }
                }
            } 
            System.out.println(" ");
        }
    }


    public static void ButterflyPattern(int rows){

        //1st Half
        for(int i=1; i<=rows; i++){
            //Numbers
            for(int j=1; j<=i; j++){   
            System.out.print("*");
            }

            //spaces
            for(int j=1; j<=2*(rows-i); j++){
            System.out.print(" ");
            }

            //Numbers
            for(int j=1; j<=i; j++){   
            System.out.print("*");
            }

            System.out.println(" ");
        }

        // Second Half
         for(int i=rows; i>=1; i--){
            //Numbers
            for(int j=1; j<=i; j++){   
            System.out.print("*");
            }

            //spaces
            for(int j=1; j<=2*(rows-i); j++){
            System.out.print(" ");
            }

            //Numbers
            for(int j=1; j<=i; j++){   
            System.out.print("*");
            }

            System.out.println(" ");
        }
    }

    public static void RhombusPat(int rows){
        for(int i=1; i<= rows; i++){
            for(int j=1; j<=(rows-i);j++){
                System.out.print(" ");
            }
            for(int j=1; j<=rows; j++){
                System.out.print("*");
            }
            
            System.out.println("");
        }
    }

        public static void RhombusHollPat(int rows){
        for(int i=1; i<= rows; i++){
            for(int j=1; j<=(rows-i);j++){
                System.out.print(" ");
            }
            for(int j=1; j<=rows; j++){
                if(i==1 || j==1 || i== rows || j==rows){
                    System.out.print("*");
                }else{
                    System.out.print(" ");
                }
            }
            
            System.out.println("");
        }
    }

        public static void DiamondPatt(int rows){
            //1st Pattern
        for(int i=1; i<=rows; i++){
            for(int j=1; j<=(rows-i);j++){
                System.out.print(" ");
            }
            for(int j=1; j<=(i*2)-1; j++){
            
                    System.out.print("*");
                
            }       
            System.out.println("");
        }

        //Pattern 2
        for(int i=rows; i>=1; i--){
            for(int j=1; j<=(rows-i);j++){
                System.out.print(" ");
            }
            for(int j=1; j<=(i*2)-1; j++){
            
                    System.out.print("*");
                
            }       
            System.out.println("");
        }
    }


    public static void main(String[] args) {
        //ButterflyPattern(4);
        DiamondPatt(7);
    }
}
