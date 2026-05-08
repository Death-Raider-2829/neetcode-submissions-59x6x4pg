class Solution {
    public void merge(int[] nums1, int m, int[] nums2, int n) {
        int current=nums1.length-1;
        int l1=m-1;
        int l2=n-1;

        if(l2==-1){
            return;
        }

        while(l1>=0 && l2>=0){
            if(nums1[l1]>nums2[l2]){
                nums1[current]=nums1[l1];
                l1--;
            }
            else{
                nums1[current]=nums2[l2];
                l2--;
            }
            current--;
        }

        while(l2>=0 && current>=0){
            nums1[current]=nums2[l2];
            current--;
            l2--;
        }
    }
}