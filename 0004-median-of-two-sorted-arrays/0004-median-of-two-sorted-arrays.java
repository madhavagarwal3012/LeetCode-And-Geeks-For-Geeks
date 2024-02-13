class Solution {
    public double findMedianSortedArrays(int[] arr1, int[] arr2) {
        int i =0;
        int j=0;
        int k=0;
        double arr3[]= new double [arr1.length+arr2.length];

        while(i < arr1.length && j < arr2.length){
            if (arr1[i]<arr2[j]){
                arr3[k]=arr1[i];
                i++;
                k++;
            }
            else{
                arr3[k]=arr2[j];
                j++;
                k++;
            }
            
        }
        while(i<arr1.length){
            arr3[k]=arr1[i];
            i++;
            k++;
        }
        while(j<arr2.length){
            arr3[k]=arr2[j];
            j++;
            k++;
        }
        double median=0.0;
        if(arr3.length%2==1){
            median=arr3[arr3.length/2];
        }
        else{
            double middle1=arr3[(arr3.length+1)/2];
            double middle2=arr3[(arr3.length-1)/2];
            median=((middle1+middle2)/2);
        }
        return median;
        
    }
}