public class binarysearch {
    public static void main(String[] args) {
        int[] a={2,5,7,9,12,14,16,17,19,20,21};
        int srch=16;
        int li=0;
        int hi=a.length-1;
        int mi=(li+hi)/2;

        while(li<hi){
            if(a[mi]==srch){
                System.out.println("element is at "+mi+" index position");
                break;
            }
            else if(a[mi]<srch){
                li=mi+1;
            }
            else{
                hi=mi-1;
            }
            mi=(li+hi)/2;
        }
        if(li>hi){
            System.out.println("element not found");
        }

    }
    
}
