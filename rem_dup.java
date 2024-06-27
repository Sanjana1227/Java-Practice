public class rem_dup {
    public static void main(String[] args) {
        
    
      int[] a={80,50,50,10,20,30,30,40,40,50,70,50,80};

        int uniCount=0;
        for(int i=0;i<a.length;i++){
            boolean isDuplicate = false;
            for(int j=0;j<i;j++){
                if(a[i]==a[j]){
                  isDuplicate = true;
                  break;
            }
            }
            if (!isDuplicate) {
                uniCount++;
            }
        } 
        
        int[] uniqueArray = new int[uniCount];
        int Index = 0;
        for (int i = 0; i < a.length; i++) {
            boolean isDuplicate = false;
            for (int j = 0; j < i; j++) {
                if (a[i] == a[j]) {
                    isDuplicate = true;
                    break;
                }
            }
            if (!isDuplicate) {
                uniqueArray[Index] = a[i];
                Index=Index+1;
            }
        }

    
        for (int k=0;k<uniqueArray.length-1;k++) {
            System.out.print(uniqueArray[k] + " ");
        }
    }
}  

 
