import java.util.Stack;

/**
 * Created by mmiazi on 11/22/2016.
 */
public class Solution {
    public static boolean isValid(String s){
        Stack<Character> stk = new Stack<Character>();
        int len = s.length();

        for(int i=0;i<len;i++){
            char ch = s.charAt(i);
            if(ch=='(' || ch=='[' || ch=='{') stk.push(ch);
            else if(ch==')'){
                if(!stk.empty() && stk.peek() == '(')stk.pop();
                else return false;
            }else if(ch=='}'){
                if(!stk.empty() && stk.peek() == '{')stk.pop();
                else return false;
            }else if(ch==']'){
                if(!stk.empty() && stk.peek() == '[')stk.pop();
                else return false;
            }else continue;
        }
        if(stk.empty())return true;
        else return false;
    }
    public static void main(String[] args){
        System.out.println(isValid("]"));
    }
}
