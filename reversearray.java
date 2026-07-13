class reversearray{
    public static void main(String[] args) {
        int arr[] ={2,3,4,5,6};



        rev(0,arr.length-1, arr);
        for (int i = 0; i   < arr.length-1; i++) {
            System.out.println(arr[i]);

        }
        

    }
    public static void rev(int left, int right , int [] arr){
        if(left>right){
            return;
        }
        else{
            int a=   arr[left];
            arr[left]=arr[right];
            arr  [right]= a;
        }
        rev(left+1, right-1, arr);
    }
}