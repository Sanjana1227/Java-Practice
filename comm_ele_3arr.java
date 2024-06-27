public class comm_ele_3arr {
    public static void main(String[] args) {
        int[] a={2,4,8};
        int[] b={2,3,4,8,10,16};
        int[] c={2,8,14,40};

        for(int i=0;i<a.length;i++){
            for(int j=0;j<b.length;j++){
                if(a[i]==b[j]){
                    for(int k=0;k<c.length;k++){
                        if(a[i]==c[k]){
                            System.out.println(a[i]);
                        }
                    }
                }
            }
        }
    }
}
 