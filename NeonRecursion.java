import java.util.Scanner;
class Main {
    public static int neon(int n){
        if(n==0){
            return 0;
        }
        else{
            return (n%10)+neon(n/10);
        }
    }
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        int n=s.nextInt();
        
        int square=n*n;
        int a=neon(square);
        if(a==n){
            System.out.println("Neon");
        }
        else{
            System.out.println("Not neon");
        }
    }
}