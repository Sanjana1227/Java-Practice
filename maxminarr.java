public class maxminarr {
    public static void main(String[] args){
        int[] arr={23,34,21,54,13,71,45};
        int max= arr[0];
        int min= arr[0];
        for(int i=1; i<= arr.length-1;i++){
            
                if(max<arr[i]){
                    max=arr[i];
                }
                else if(min>arr[i]){
                    min=arr[i];
                }
        
        }
        System.out.println(max+" "+min);
    }
}
