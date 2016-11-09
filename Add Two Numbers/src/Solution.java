import java.util.ArrayList;

public class Solution{
//    public static ListNode addTwoNumbers(ListNode l1, ListNode l2) {
//        ListNode res=null;
//        ArrayList<Integer> list1 = new ArrayList();
//        ArrayList<Integer> list2 = new ArrayList();
//
//        while(l1!=null){
//            list1.add(l1.val);
//            l1 = l1.next;
//        }
//        while(l2!=null){
//            list2.add(l2.val);
//            l2 = l2.next;
//        }
//        int len1 = list1.size();
//        int len2 = list2.size();
//        int len = len1;
//        if(len2>len) len = len2;
//
//        if(len>len1)for(int i=len1;i<len;i++){
//            list1.add(0);
//        }else if(len>len2)for(int i=len2;i<len;i++){
//            list2.add(0);
//        }
//        int carry=0;
//        int t = list1.get(0)+list2.get(0)+carry;
//        ListNode point = new ListNode(t%10);
//        res = point;
//        carry = t/10;
//        for(int i=1;i<len;i++){
//            int t2 = list1.get(i)+list2.get(i)+carry;
//            point.next = new ListNode(t2%10);
//            carry = t2/10;
//            point = point.next;
//        }
//        if(carry>0){
//            point.next = new ListNode(carry);
//            point.next.next = null;
//        }
//        return res;
//    }
    public static ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        int digit1 = l1.val,digit2 = l2.val;
        int start = 10;
        while((l1.next!=null) && (l2.next!=null)){
            digit1 += l1.val*start;
            digit2 += l2.val*start;
            start *= 10;
            l1 = l1.next;
        }
        while(l1.next != null){
            l1 = l1.next;
            digit1 += l1.val*start;
            start *= 10;
        }
        while(l2.next != null){
            l2 = l2.next;
            digit2 += l2.val*start;
            start *= 10;
        }
        System.out.println((digit1 + digit2));
        return l1;

    }
    public static void main(String [] args){
        ListNode l1  = new ListNode(2);
        l1.next = new ListNode(4);
        l1.next.next = new ListNode(6);

        ListNode l2  = new ListNode(5);
        l2.next = new ListNode(6);
        l2.next.next = new ListNode(4);
        l2.next.next.next = new ListNode(9);
        l2.next.next.next.next =null;
        ListNode res = addTwoNumbers(l1,l2);
        while(res!=null){
            System.out.print(res.val+" ");

            res = res.next;
        }System.out.println();

    }
}