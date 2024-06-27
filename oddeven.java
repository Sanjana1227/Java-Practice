import java.util.ArrayList;

public class oddeven {
    public static void main(String[] args) {
        int[] a={8,5,10,12,3,1,4};
        ArrayList<Integer> al1= new ArrayList<>();
        ArrayList<Integer> al2 = new ArrayList<>();

        for(int i=0;i<a.length;i++){
            
            if(a[i]%2==0){
                al1.add(a[i]);
            }
            else{
                al2.add(a[i]);
            }
        }
        System.out.println("Even number are");
        int evenadd=0;
        for(int no: al1){
            evenadd=evenadd+no;
            System.out.println(no + " ");
        }
        System.out.println("Addition of all even number is "+ evenadd);
        System.out.println("Total no. of even numbers are "+ al1.size());

        System.out.println("Odd number are");
        int oddadd=0;
        for(int no: al2){
            oddadd=oddadd+no;
            System.out.println(no + " ");
        }
        System.out.println("Addition of all even number is "+ oddadd);
        System.out.println("Total no. of even numbers are "+ al2.size());
    }
}
