package Bit_topicEveryday._11_22;

import java.util.Scanner;
import java.lang.StringBuffer;

public class Main {
    public static boolean palindrome(String str) {
        if (str.equals("")) {
            return true;
        }
        int start = 0;
        int end = str.length() - 1;

        while (start < end) {
            if (str.charAt(start) != str.charAt(end)) {
                return false;
            }
            start++;
            end--;
        }
        return true;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String A = "";
        String B = "";
        A = sc.next();
        B = sc.next();

        int count = 0;
        StringBuffer a = new StringBuffer(A);
        StringBuffer b = new StringBuffer(B);

        for (int i = 0; i < a.length() + 1; i++) {
            StringBuffer temp = new StringBuffer(a);
            temp.insert(i, b);
            if (palindrome(temp.toString())) {
                count++;
            }
        }
        System.out.println(count);
    }
}
