import java.util.Scanner;
public class KaprekarNumber{
    public static void main(String [] args){
        Scanner s = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int n = s.nextInt();

        boolean isKaprekar = false;
        int square=n*n;
        int count=0;
        int temp=square;
        while(temp>0){
            count++;
            temp/=10;
        }
        
        for(int i=1;i<count;i++){
            long div=(long)Math.pow(10,i);
            long quo=square/div;
            long rem=square%div;
            if(quo+rem==n){
                isKaprekar=true;
                break;
            }
        }
        if(isKaprekar){
            System.out.println(n+" is Kaprekar Number");
        }
        else{
            System.out.println(n+" is not a Kaprekar Number");
        }
    }
}