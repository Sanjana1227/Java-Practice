public class rev_dup_sorted {
    public static void main(String[] args) {
        int[] a={1,2,2,3,4,5,5};
        int[] temp=new int[a.length];
        int j=0;
        for(int i=0;i<a.length-1;i++){
            if(a[i]!=a[i+1]){
                temp[j]=a[i];
                j=j+1;
            }
            temp[j]=a[a.length-1];
        }
        for(int i=0;i<temp.length-1;i++){
            System.out.println(temp[i]);
        }
    }
    /* for(int i=0;i<=a.length;i++){
        for(int j=i+1;j<a.length-1;j++){
            if(a[i]==a[j]){
                a[i+1]=a[j+1];
            }
        }
    }
    for(int i=0;i<a.length-2;i++){
        System.out.println(a[i]);
    }*/
}
