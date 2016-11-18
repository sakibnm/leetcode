/**
 * Created by mmiazi on 11/15/2016.
 */
public class Solution {
    public static int myAtoi(String str){

        char[] s = str.toCharArray();
        if(s.length==0)return 0;
        int ptr =0;
        boolean positive = true;
        while(s[ptr]==' '){
            ptr++;

        }

        if(s[ptr] == '-'){
            //System.out.println("bal");
            ptr++;
            positive =false;
        }else if(s[ptr] == '+') {
            //System.out.println("bal");
            ptr++;
        }

        long res=0;

        for(int i=ptr;i<s.length;i++){
            if (s[i]<48 || s[i]>57)break;
            long re= res*10+s[i]-48;
            if(re>Integer.MAX_VALUE)return 0;
            res= re;
        }
        if(positive)return (int)res;
        else return -1*(int)res;
    }
    public static void main(String[] args){
        System.out.println(myAtoi("1"));

    }
}
