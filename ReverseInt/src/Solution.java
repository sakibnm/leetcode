/**
 * Created by mmiazi on 11/15/2016.
 */
public class Solution {
    public static int reverse(int x) {
        long res = 0;

        System.out.println(x);
        while (x != 0) {
            res = res * 10 + x % 10;
            if(res>Integer.MAX_VALUE || res<Integer.MIN_VALUE) return 0;
            x /= 10;

        }

        return (int)res;
    }
    public static void main(String[] args){
        System.out.println(reverse(Integer.MAX_VALUE));
    }
}
