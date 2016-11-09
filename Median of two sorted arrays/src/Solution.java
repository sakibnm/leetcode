/**
 * Created by mmiazi on 11/9/2016.
 */
public class Solution {
    public static double findMedianSortedArrays(int[] nums1, int[] nums2) {
        int m = nums1.length;
        int n = nums2.length;
        int i=0, j=0, k=0,a=0,b=0, r= m+n;
        a= r/2;
        if(r%2==0){
            b= a-1;
        }else{
            b= a;
        }

        int[] resArr = new int[a+1];

        while(i<m && j<n && k<=a){
              if( nums1[i] <= nums2[j]){
                  resArr[k] = nums1[i];
                  k++;
                  i++;
              }else{
                  resArr[k] = nums2[j];
                  k++;
                  j++;
              }
        }
        if(i==m){
            while(k<=a){
                resArr[k] = nums2[j];
                k++;
                j++;
            }
        }else{
            while(k<=a){
                resArr[k] = nums1[i];
                k++;
                i++;
            }
        }
        if(r%2==0){
            return (resArr[k-1]+resArr[k-2])/2.00;
        }else{
            return (resArr[k-1])/1.00;
        }

    }
    public static void main(String[] args){
        int[] arr1 = {1,2,3,4};
        int[] arr2 = {4,6};
        System.out.println(findMedianSortedArrays(arr1,arr2));

    }
}
