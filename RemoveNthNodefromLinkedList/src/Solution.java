public class Solution {
    public static ListNode removeNthFromEnd(ListNode head, int n) {
        try {
            int count = 0;
            ListNode cur = head;
            while (cur != null) {
                count++;
                cur = cur.next;
            }
            if(count==1 && n==1)return head.next;
            cur = head;
            if(n==1){
                while (cur.next.next != null) {
                    count++;
                    cur = cur.next;
                }cur.next= null;
                return head;
            }
            count = count - n;
            head = cur;
            for(int i=1;i<=count;i++){
                cur = cur.next;
            }
            while(cur.next.next!=null){
                cur.val = cur.next.val;
                cur = cur.next;
            }
            cur.val = cur.next.val;
            //cur = cur.next;
            cur.next = null;

        }catch(Exception e){

        }
        return head;
    }

    public static void main(String[] args){
        ListNode newList = new ListNode(1);
        newList.next = new ListNode(2);
        //newList.next = null;
        newList.next.next = new ListNode(3);
        newList.next.next.next = new ListNode(4);
        newList.next.next.next.next = new ListNode(5);
        newList.next.next.next.next.next= null;
        ListNode res = removeNthFromEnd(newList, 1);
        while(res!=null){
            System.out.println(res.val);
            res = res.next;
        }
    }
}
