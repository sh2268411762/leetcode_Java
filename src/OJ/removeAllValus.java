package OJ;

class ListNode {
    int val;
    ListNode next;
    ListNode(int x) { val = x; }
}

public class removeAllValus {
    public ListNode removeElements1(ListNode head, int val)
    {
        if(head == null)   //判空
        {
            return null;
        }

        //否则
        head.next = removeElements1(head.next,val);
        return head.val == val ? head.next : head;   //等于则返回下一个节点，否则返回原节点
    }

    public ListNode removeElements2(ListNode head, int val)
    {
        while (head != null && head.val == val)   //头节点不为空且头节点的值需要被删除
            head = head.next;
        ListNode prev = head;
        if (prev != null)   //前驱不为空即head不为空
        {
            while (prev.next != null)  //到这步说明头节点的val一定不为要删除的val
            {
                if (prev.next.val == val)
                    prev.next = prev.next.next;
                else
                    prev = prev.next;
            }
        }
        return head;
    }
    public ListNode removeElements3(ListNode head, int val)
    {
        ListNode temp = new ListNode(-1);
        temp.next = head;
        ListNode cur = temp;

        while(cur.next != null)
        {
            if(cur.next.val == val)
            {
                cur.next = cur.next.next;
            }
            else
            {
                cur = cur.next;
            }
        }
        return temp.next;
    }
}