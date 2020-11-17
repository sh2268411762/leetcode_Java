package _02;

public class Java_1 {
    public static void main(String args[]) {
        int i, count;

        //*********Found********
        count = 0;

        for (i = 100; i <= 200; i++)
            //*********Found********
            if (i % 3 == 0) count++;

        //*********Found********
        System.out.println("Count = " + count);
    }
}
