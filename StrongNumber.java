import java.util.Scanner;
public class Main{
    public static int factorial(int num ){
        int fact=1;
        for(int i=1;i<=num;i++){
            fact=fact*i;
        }
        return fact;
    }
    public static void main(String [] args){
        Scanner s=new Scanner(System.in);
        int num=s.nextInt();
        
        int temp=num;
        int sum=0;
        while(num>0){
            int digit=num%10;
            sum+=factorial(digit);
            num/=10;
        }
        if(sum==temp){
            System.out.println("Strong number");
        }
        else{
            System.out.println("Not a Strong number");
        }
    }
}
