import java.util.HashMap;

/**
 * Created by mmiazi on 11/3/2016.
 */
public class Solution {
    public static int lengthOfLongestSubstring(String s) {
        HashMap ascii = new HashMap();
        int max = 0;

        int first=0;
        char cur=555, prevcur;
        int count=0;
        try{
            for (int i=0;i<s.length();i++){
                prevcur = cur;
                cur =s.charAt(i);
                if(cur==prevcur){
                    first = i;
                    ascii.clear();
                    ascii.put(cur,i);
                    count =1;
                }else if(ascii.containsKey(cur)){

                    int temp = (int)ascii.get(cur);
                    int max_t = ascii.size();
                    if(max_t>max)max = max_t;
                    if(temp!=0){
                        for(int j=first;j<temp;j++){
                            if(ascii.containsKey(s.charAt(j)))ascii.remove(s.charAt(j));
                        }
                        first =temp;
                    }else first++;


                    count = ascii.size();
                    ascii.put(cur,i);
                }else{
                    ascii.put(cur,i);
                    count+=1;
                    if(count>max)max=count;
                }
            }


        }catch(Exception e){

        }
        if(count>max)max=count;

        //System.out.println(max);

        return max;

    }
    public static void main(String[] args){
        String test = "ggububgvfk";
        String test1 = "abcabcbb";
        String test2 = "bbbbbb";
        String test3 = "abcdeafgd";

        System.out.println(lengthOfLongestSubstring(test));
        System.out.println(lengthOfLongestSubstring(test1));
        System.out.println(lengthOfLongestSubstring(test2));
        System.out.println(lengthOfLongestSubstring(test3));

    }
}
