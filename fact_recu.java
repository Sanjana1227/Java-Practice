import java.util.Scanner;
public class fact_recu {
    static int fact = 1;
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("Enter num");
        int num = s.nextInt();

        fact_recu fu = new fact_recu();
        fu.calcFact(num);
        System.out.println("Factorial of "+ num +" is "+ fact);
    }
    void calcFact(int num){
        if(num>=1){
            fact=fact*num;
            calcFact(num-1);;
        }
    }
    
}
