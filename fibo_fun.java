import java.util.Scanner;
public class fibo_fun {
    int a=0, b=1;
    int c;
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("Enter value till...");
        int num = s.nextInt();

        fibo_fun fib = new fibo_fun();
        fib.fibo(num) ;
        
    }
    void fibo(int i){
        if(i>0){
            c=a+b;   
            a=b;
            b=c;
            System.out.println(c);
            fibo(i-1);

        }
    }
}
