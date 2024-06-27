public class missing {
    public static void main(String[] args) {
        int[] a={1,2,3,4,5,6,7,9,10};
        int expected_no_element = a.length +1;
        int total_sum = expected_no_element*(expected_no_element+1)/2;
        int sum=0;
        for(int i=0;i<=a.length-1;i++){
            sum=sum+a[i];
        }
        System.out.println("missing number is "+(total_sum-sum));
    }
}
