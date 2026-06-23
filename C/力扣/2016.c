void swap(int *a,int *b){
    int temp=*a;
    *a=*b;
    *b=temp;
}

void algorithm(int arr[],int left,int right){
    if(left>=right){
        return;
    }
    int pivot=arr[left];
    int i=left,j=right;
    while(i<j){
        while(i<j&&arr[j]>=pivot){
            j--;
        };
        while(i<j&&arr[i]<=pivot){
            i++;
        };
        swap(&arr[i],&arr[left]);
    }
    swap(&pivot,&arr[i]);
    algorithm(arr,left,i-1);
    algorithm(arr,j+1,right);
}