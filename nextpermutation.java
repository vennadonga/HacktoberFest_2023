public void nextPermutation(int[] arr) {
       
        int i=arr.length-2;
        while(i>=0 && arr[i]>=arr[i+1])
            i--;
        if(i>=0)
        {
            int j=arr.length-1;
            while( j>=0 && arr[j]<=arr[i])
                j--;
            swap(arr,i,j);
           
        }
         rev(arr,i+1,arr.length-1);
       
    }
    public static void swap(int arr[],int i,int j)
    {
        int temp=arr[i];
        arr[i]=arr[j];
        arr[j]=temp;
    }
    public static void rev(int arr[],int i,int j)
    {
        while(i<j)
            swap(arr,i++,j--);
    }