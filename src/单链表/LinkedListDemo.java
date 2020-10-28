package 单链表;


class Node
{
    public int data;
    public Node next;   //默认为空

    public Node(int _data)
    {
        this.data = _data;
    }
}
public class LinkedListDemo
{
    //单链表的最后一个节点的next域为null
    public Node head;   //头结点






    //头插
    public void addFirst(int _value)
    {
        Node node = new Node(_value);
        if (this.head != null) {
            node.next = this.head;
        }
        this.head = node;
    }

    //尾插
    public void addLast(int _value)
    {
        Node node = new Node(_value);
        if(this.head.next == null) //第一次插入
        {
            this.head = node;
        }
        else//不是第一次插入
        {
            Node cur = this.head;
            while(cur.next != null)
            {
                cur = cur.next;
            }
            cur.next = node;
        }

    }

    //求单链表长度
    public int getLength()
    {
        int length = 0;
        if(this.head.next != null)
        {
            Node cur = this.head;
            while(cur != null)
            {
                length++;
                cur = cur.next;
            }
        }
        return length;
    }

    //检查下标合法性
    public boolean checkIndex(int index)
    {
        if(index < 0 || index > this.getLength())
        {
            System.out.println("下标不合法！");
            return false;
        }
        return true;
    }


    //按下标插入
    public void addIndex(int index,int _value)
    {
        if(!this.checkIndex(index))
        {
            return;
        }

        int useSize = this.getLength();
        if(index == 0)
        {
            addFirst(_value);
            return;
        }
        if(index == useSize)
        {
            addLast(_value);
            return;
        }
        Node cur = searchPrevIndex(index);
        Node node = new Node(_value);
        node.next = cur.next;
        cur.next = node;
    }

    //查找index-1的位置，并返回引用
    public Node searchPrevIndex(int index)
    {
        Node cur = this.head;
        int count = 0;
        while(count < index - 1)
        {
            cur = cur.next;
            count++;
        }

        return cur;
    }


    //打印
    public void display()
    {
        Node cur = this.head;
        while(cur != null)
        {
            System.out.print(cur.data + " ");
            cur = cur.next;
        }
        System.out.println();
    }

    //按关键字查找
    public Node searchPrevKey(int key)
    {
        Node cur = this.head;
        while(cur.next != null)
        {
            if(cur.next.data == key)
            {
                return cur;
            }
            cur = cur.next;
        }
        return null;
    }

    //查找是否包含关键字key是否在单链表当中
    public boolean contains(int key)
    {
        return this.searchPrevKey(key) != null;
    }
    //删除所有值为key的节点
    public void removeAllKey(int key)
    {
        if(this.head == null)
        {
            System.out.println("单链表没有元素");
            return;
        }
        if(this.head.data == key)
        {
            this.remove(key);
            return;
        }
        Node cur = this.head;
        while(cur.next != null)
        {
            if(this.contains(key))
            {
                this.remove(key);
            }
            cur = cur.next;
        }
    }
    //删除第一次出现的关键字为key的结点
    public void remove(int key)
    {
        if(this.head == null)
        {
            System.out.println("单链表没有元素");
            return;
        }

        if(this.head.data == key)
        {
            head = head.next;
            return;
        }

        Node cur = this.searchPrevKey(key);
        if(cur != null)
        {
            Node del = cur.next;
            cur.next = del.next;
        }
        else
        {
            System.out.println("单链表没有" + key + "元素！");
        }

    }

}
