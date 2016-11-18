/**
 * Created by mmiazi on 11/18/2016.
 */
public class Solution {
    public static int maxArea(int[] height) {
        int max=0;
        int i=0,j=height.length-1;
        while(i< j){
            int area = Math.min(height[i], height[j])*( j-i);
            if(area > max) max = area;
            if(height[i] < height[j])i++ ;
            else j--;
        }

        return max;
    }
    public static void main(String[] args){
        int[] height = {2,3,4};
        System.out.println(maxArea(height));
    }
}
