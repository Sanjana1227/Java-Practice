public class lar2nd {
    public static void main(String[] args) {
        int[] arr={34,21,56,32,71,26,76};
        int temp;
        for(int i=0;i<arr.length;i++){
            for(int j=i+1;j<arr.length;j++){
                if(arr[i]<arr[j]){
                    temp=arr[i];
                    arr[i]=arr[j];
                    arr[j]=temp;
                    
                }
            }
        }
        System.out.println("Second largest element is "+arr[1]);
        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i]+",");
        }

    }
}
