import java.util.ArrayList;

public class Solution{
    public static ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        ListNode res=new ListNode(0);
        ListNode cur = res;
        while(l1!=null || l2!=null){

        }
        return res;
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