class Solution {
    public void merge(int[] nums1, int m, int[] nums2, int n) {
        int index=0;
        int index2=0;
        while(index<m){
            if(n>0){
                if(nums1[index]<=nums2[index2]){
                    index++;
                }
                else{
                    int temp=nums1[index];
                    nums1[index]=nums2[index2];
                    nums2[index2]=temp;

                    index++;

                    int index3=index2;
                    while(index3<n-1 && nums2[index3]>nums2[index3+1]){
                        temp=nums2[index3+1];
                        nums2[index3+1]=nums2[index3];
                        nums2[index3]=temp;
                        index3++;
                    }
                }
            }
            else{
                return;
            }
        }
        while(index2<n-1 && nums2[index2]>nums2[index2+1]){
            int temp=nums2[index2+1];
            nums2[index2+1]=nums2[index2];
            nums2[index2]=temp;
            index2++;
        }
        index2=0;
        while(index2<n){
            nums1[index]=nums2[index2];
            index++;
            index2++;
        }
    }
}