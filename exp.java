class exp{
    public static void main(String args[]){

    int arr[]={1,1,2,2,3,3,4,4,5,6,7,7,8,8,1,4,2,3,3};

    int n=arr.length;

    for(int i=0 ; i<n ; i++){
        for(int j= i+1 ; j<n ; j++){

            if(arr[i]==arr[j]){
                arr[j]=arr[--n];
            }
            else{
                j++;
            }
        }
       
    }
    for(int i=0;i<n;i++){
        System.out.println(arr[i]);
    }
}
}
