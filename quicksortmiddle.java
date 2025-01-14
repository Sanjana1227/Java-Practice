public class quicksortmiddle {
    public static void main(String[] args) {
        int[] arr={15,9,7,13,12,16,4,18,11};
        int leng= arr.length;
        quicksortmiddle qsm= new quicksortmiddle();
        qsm.quicksortrecursion(arr, 0, leng-1);
        qsm.printarray(arr);
        
    }
    int partition(int[] arr, int low, int high){
        int pivot = arr[(low+high)/2];
        while(low <= high){
            while(arr[low]<pivot){
                low++;
            }
            while(arr[high] > pivot){
                high--;
            }
            if(low<=high){
                int temp=arr[low];
                arr[low]=arr[high];
                arr[high]=temp;
                low++;
                high--;
            }
        }
        return low;        
    }
    void quicksortrecursion(int[] arr, int low, int high){
        int pi= partition(arr, low, high);
        if(low<pi-1){
            quicksortrecursion(arr, low, pi-1);
        }
        if(high>pi){
            quicksortrecursion(arr, pi, high);
        }
    }
    void printarray(int[] arr){
        for(int i : arr){
            System.out.print(i +" ");
        }
    }
    
}
