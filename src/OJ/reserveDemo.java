package OJ;



/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) { val = x; }
 * }
 */

public class reserveDemo {
    public ListNode reverseList(ListNode head)
    {
//        ListNode cur = head;
//        ListNode prev = null;
//
//        while(cur != null)
//        {
//            ListNode temp = cur.next;
//            cur.next = prev;
//            prev = cur;
//            cur = temp;
//        }
//        return prev;


        //尾插法
        ListNode cur = head;
        ListNode prev = null;
        ListNode newHead = null;

        while(cur != null)
        {
            ListNode temp = cur.next;
            if(temp == null)
            {
                newHead = cur;
                break;
            }
            cur.next = prev;
            prev = cur;
            cur = temp;
        }
        return newHead;
    }
}
