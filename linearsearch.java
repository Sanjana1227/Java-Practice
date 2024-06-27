import java.util.Scanner;
public class linearsearch {
    public static void main(String[] args) {
        int[] arr={5,7,2,4,6,1};

        Scanner n = new Scanner(System.in);
        System.out.println("Enter number to search");
        int num= n.nextInt();

        int temp=0;

        for(int i=0; i<arr.length;i++){
            if(arr[i]==num){
                System.out.println("Index number of element is "+ i);
                temp=temp+1;
            }
        }
        if(temp==0){
            System.out.println("Element not found");
        }
        
        
    }
    
}
