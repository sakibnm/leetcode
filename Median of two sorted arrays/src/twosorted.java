/**
 * Created by mmiazi on 11/14/2016.
 */
public class twosorted {
//    public static int findkth(int[] nums1, int[] nums2, int start1, int start2, int k){
//
//        if(start1>= nums1.length){
//            return nums2[start2+k];
//        }
//        if(start2 >= nums2.length){
//            return nums1[start1+k];
//        }
//        if(k==1)return Math.min(nums1[start1],nums2[start2]);
//        int m1 = start1+k/2-1;
//        int m2 = start2+k/2-1;
//        int mid1, mid2;
//        if(m1<nums1.length)mid1 = nums1[m1];
//        else mid1 = Integer.MAX_VALUE;
//        if(m2<nums2.length)mid2 = nums2[m2];
//        else mid2 = Integer.MAX_VALUE;
//        if(mid1>mid2) findkth(nums1, nums2, start1, m1+1, k-k/2);
//        else findkth(nums1, nums2, m2+1, start2, k-k/2);
//        //return 0;
//        return Integer.MAX_VALUE;
//    }
    public static int findKth(int[] nums1, int[] nums2, int s1, int s2, int k){
        if(s1>=nums1.length)
            return nums2[s2+k-1];

        if(s2>=nums2.length)
            return nums1[s1+k-1];

        if(k==1)
            return Math.min(nums1[s1], nums2[s2]);

        int m1 = s1+k/2-1;
        int m2 = s2+k/2-1;

        int mid1 = m1<nums1.length?nums1[m1]:Integer.MAX_VALUE;
        int mid2 = m2<nums2.length?nums2[m2]:Integer.MAX_VALUE;

        if(mid1<mid2){
            return findKth(nums1, nums2, m1+1, s2, k-k/2);
        }else{
            return findKth(nums1, nums2, s1, m2+1, k-k/2);
        }
    }

    public static double findMedianSortedArrays(int[] nums1, int[] nums2){

        int len1 = nums1.length;
        int len2 = nums2.length;
        int len = len1+len2;
        int k = len/2;
        if(len%2==0){
            return (findKth(nums1, nums2, 0, 0, k+1)+findKth(nums1, nums2, 0, 0, k))/2.00;
        }else{
            return findKth(nums1, nums2, 0, 0, k+1);
        }
    }
    public static void main(String[] args){
        int[] nums1 = {1,2,3,6};
        int[] nums2 = {4,8,10};

        System.out.println(findMedianSortedArrays(nums1,nums2));

    }
}
