public class largest {
    public static void main(String[] args) {
        int arr[]= new int[]{10,20,40,55,30,33};
        int max = arr[0];
        for(int i=0;i<arr.length; i++){
            if(arr[i]> max){
                max=arr[i];
            }
        }
        System.out.println("Largest element is "+ max);
    }
}
