/**
 * Created by mmiazi on 11/14/2016.
 */
public class Solution {
    public static String longestPalindrome(String s){

        char[] str = s.toCharArray();
        int longestLeft=0, longestRight=0;

        for(int m=0;m<str.length;m++){
            int left = m;
            int right = m;
            while(left>=0 && right<str.length){
                if(str[left]==str[right]){
                    if(right-left>longestRight-longestLeft){
                        longestLeft = left;
                        longestRight = right;

                    }

                }else break;
                left--;
                right++;


            }
            left = m;
            right = m+1;
            while(left>=0 && right<str.length){
                if(str[left]==str[right]){
                    if(right-left>longestRight-longestLeft){
                        longestLeft = left;
                        longestRight = right;

                    }

                }else break;
                left--;
                right++;


            }

        }
        return s.substring(longestLeft, longestRight+1);
    }
    public static void main(String[] args){
        System.out.println(longestPalindrome("bb"));

    }
}
