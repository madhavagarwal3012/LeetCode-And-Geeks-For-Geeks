// User function Template for Java

class Solution {
    // Function to merge the arrays.
    public void mergeArrays(int a[], int b[]) {
        // code here
        int index1 = a.length - 1;
        int index2 = 0;
        
        while(index1 >= 0 && index2 < b.length){
            if(a[index1] >= b[index2]){
                int temp = a[index1];
                a[index1] = b[index2];
                b[index2] = temp;
                
                index1--;
                index2++;
            }
            else{
                break;
            }
        }
        Arrays.sort(a);
        Arrays.sort(b);
    }
}
