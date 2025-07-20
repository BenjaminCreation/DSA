


public class DeciBinCon {
    
    public int DeciToBin(int n){
        int i=0;
        int decNum=n;
        int binNum = 0;
        while(n>0){
            int r=n%2;
            binNum=binNum+ (r*(int)(Math.pow(10,i)));
            i++;
            n=n/2;
        }
        return binNum;
    }

    public void main (String args[]){
        int binNum = DeciToBin(6);
        System.out.println("The Binary Number is: "+binNum);

    }
}
