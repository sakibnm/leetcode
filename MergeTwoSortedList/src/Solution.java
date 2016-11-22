import java.util.ListResourceBundle;

/**
 * Created by mmiazi on 11/18/2016.
 */
class ListNode {
    int val;
    ListNode next;

    ListNode(int x) {
        val = x;
    }
}

public class Solution {
    public static ListNode mergeTwoLists(ListNode l1, ListNode l2) {
        ListNode merged = new ListNode(0);

        ListNode cur = merged;
        if (l1 != null && l2 != null) {
            while (l1 != null && l2 != null) {
                if (l1.val < l2.val) {
                    cur.next = new ListNode(l1.val);
                    l1 = l1.next;
                    cur = cur.next;
                } else {
                    cur.next = new ListNode(l2.val);
                    l2 = l2.next;
                    cur = cur.next;
                }
            }
            if (l1 == null) {
                while (l2 != null) {
                    cur.next = new ListNode(l2.val);
                    cur = cur.next;
                    l2 = l2.next;
                }
            }
            if (l2 == null) {
                while (l1 != null) {
                    cur.next = new ListNode(l1.val);
                    cur = cur.next;
                    l1 = l1.next;
                }
            }
        } else if (l1 == null) {
            while (l2 != null) {
                cur.next = new ListNode(l2.val);
                cur = cur.next;
                l2 = l2.next;
            }
        } else {
            while (l1 != null) {
                cur.next = new ListNode(l1.val);
                cur = cur.next;
                l1 = l1.next;
            }

        }
        cur.next=null;

        return merged.next;
    }

    public static void main(String[] args) {

        int start1 = 0;
        int start2 = 1;

        ListNode list1 = new ListNode(1);
        list1.next = new ListNode(2);
        ListNode list2 = new ListNode(1);
        list2.next = new ListNode(3);
        ListNode res = mergeTwoLists(list1, list2);

        while (res != null) {
            System.out.print(res.val + " ");
            res = res.next;
        }

    }

}
