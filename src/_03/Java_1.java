package _03;

public class Java_1 {
    void equalsMethod1() {
        //*********Found**********
        String s1 = new String("how are you");
        //*********Found**********
        String s2 = new String("how are you");
        System.out.println(s1 == s2);
    }

    public static void main(String args[]) {
        //*********Found**********
        Java_1 OperAndExp = new Java_1();
        //用于复合类型数据的“＝＝”运算符
        OperAndExp.equalsMethod1();
    }
}
