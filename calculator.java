import java.util.Scanner;
public class calculator {
    public static void main(String[] args) 
    {
        String yn;
        do{
            Scanner s = new Scanner(System.in);

            System.out.println("Enter first no.");
            int a = s.nextInt();
            System.out.println("Enter Second Number");
            int b = s.nextInt();
            System.out.println("Enter any Operator (+,-,*,/)");
            String oper = s.next();
            int result;

          switch(oper){
                case "+": result = a+b;
                        System.out.println("Addition is "+ result);
                        break;
                case "-": result= a-b;
                        System.out.println("Subtraction is "+ result);
                        break;

                case "*": result = a*b;
                        System.out.println("Multiplication is "+ result);
                        break;
                case "/": result = a/b;
                        System.out.println("Division is "+ result);
                        break;
                default: System.out.println("Invalid");
            }
        
        System.out.println("Want to continue(Press Y for Yes, N for No)");
        yn = s.next();
        }
        while( yn.equals("y") || yn.equals("Y"));
    }
    }

