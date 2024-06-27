public class primeno {
    public static void main(String[] args) {
        int num = 71;
        int len = 0;
        for(int i = 2; i < num ; i++){
            if(num % i == 0){
                len = len + 1;
            }
        }
        if(len>0){
            System.out.println("Not Prime");
        }
        else{
            System.out.println("Prime");
        }
    }
}
