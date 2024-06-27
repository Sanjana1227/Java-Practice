public class Palindrome {
    public static void main(String[] args) {
        int num = 121;
        int rem, rev=0;
        int temp = num;
        while(temp>0){
            rem = temp % 10;
            rev = rev * 10 + rem;
            num = temp / 10;
        }
        if( temp == rev){
            System.out.println("Palindrome");
        }
        else{
            System.out.println("Not Palindrome");
        }
    }
}
