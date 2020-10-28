package 线性表;

import java.util.Arrays;

//顺序表
public class sequenceList
{
    public int[] elem;    //默认null
    public int usedSize;  //默认0，可用空间

    public sequenceList(int _size)
    {
        this.elem = new int[_size];
    }

    public sequenceList()
    {
        this.elem = new int[10];
    }


    public static void main(String[] args)
    {
        sequenceList seq1 = new sequenceList(5);   //默认为10个元素
        seq1.add(0,1);
        seq1.add(1,2);
        seq1.add(2,3);
        seq1.add(3,4);
        seq1.add(4,5);
        seq1.display();

        System.out.println(seq1.contains(5));          //true
        System.out.println(seq1.contains(10000));       //false
        System.out.println(seq1.search(2));    //1
        System.out.println(seq1.search(4));     //3
        System.out.println(seq1.search(8888));   //-1
        System.out.println(seq1.getPos(4));             //5
        System.out.println(seq1.getPos(100));           //非法

        seq1.remove(1);
        seq1.display();
        seq1.remove(3);
        seq1.display();
        seq1.remove(5);
        seq1.display();
        seq1.remove(999);
    }


    // 打印顺序表
    public void display()
    {
        for (int i = 0;i < this.usedSize;i++)
        {
            System.out.print(this.elem[i] + " ");
        }
        System.out.println();
    }

    // 在 pos 位置新增元素，若pos有元素则后移该位置原数据
    public void add(int pos, int data)
    {
        if(pos < 0 || pos > this.usedSize)
        {
            System.out.println("输入位置非法");
            return;
        }

        int i = this.usedSize - 1;
        if(this.usedSize == this.elem.length)   //扩容
        {
            this.elem = Arrays.copyOf(this.elem,2 * this.elem.length);
        }
        while(i >= pos)
        {
            this.elem[i + 1] = this.elem[i];
            i--;
        }
        this.elem[pos] = data;
        this.usedSize++;
    }

    // 判定是否包含某个元素
    public boolean contains(int toFind)
    {
        for (int i = 0;i < this.usedSize;i++)
        {
            if(this.elem[i] == toFind)
            {
                return true;
            }
        }
        return false;
    }

    // 查找某个元素对应的位置（有多个则返回第一个的位置）
    public int search(int toFind)
    {
        for(int i = 0;i < this.usedSize;i++)
        {
            if(this.elem[i] == toFind)
            {
                return i;
            }
        }
        return -1;
    }

    // 获取 pos 位置的元素（判断pos是否合法）
    public int getPos(int pos)
    {
        if(pos < 0 || pos >= this.usedSize)
        {
            System.out.print("输入位置非法\t");
            return -1;
        }
        return this.elem[pos];
    }

    // 给 pos 位置的元素设为 value
    public void setPos(int pos, int value)
    {
        if(pos < 0 || pos >= this.usedSize)
        {
            System.out.print("输入位置非法\t");
            return ;
        }
        this.elem[pos] = value;
    }

    //删除第一次出现的关键字key
    public void remove(int toRemove)
    {
        int index = this.search(toRemove);
        if(-1 == index)
        {
            System.out.println("没有该数字，无法删除");
        }
        else
        {
            for(int i = index;i < this.usedSize - 1;i++)
            {
                this.elem[i] = this.elem[i + 1];
            }
            this.usedSize--;
        }
    }

    // 获取顺序表长度
    public int size()
    {
        return this.usedSize;
    }

    // 清空顺序表
    public void clear()
    {
//        for (int i = 0;i < this.usedSize;i++)
//        {
//            //this.elem[i] = null;    //引用类型必须设置为空
//        }
        this.usedSize = 0;
    }
}
