public class duplicate {
    public static void main(String[] args) {
        int arr[]= new int[]{12,17,14,16,12};
        for(int i =0; i < arr.length; i++){
            for(int j= i+1; j < arr.length ; j++){
                if(arr[i]==arr[j] && i!=j){
                    System.out.println(arr[j]);
                }
            }
        }
    }
}
