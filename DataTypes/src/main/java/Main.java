package az.mycode;

import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

//        System.out.println(Test(12345));
        System.out.println(GetElement(122134234));
    }

//    public static int Test(int a) {
//
//        int Sum = 0;
//        int i = 1;
//        while (a > 10) {
//            int on = 1;
//            int k = i;
//            while (k > 0) {
//                on *= 10;
//                k--;
//            }
//            Sum = Sum + (a % 10) * on;
//            a = a / 10;
//            i++;
//        }
//        return Sum + a;
//
//    }

    public static int GetElement(int a) {

        int Sum = 0;
        int i = MyCount(a);
        int b = a;
        int on = 1;

        while (a > 0) {
            b = a % 10;
            if (!IsEven(i)) {
                Sum = Sum + b * on;
                on*=10;
            }
            a = a / 10;
            i--;
        }


        return Sum;
    }

    public static boolean IsEven(int i) {
        if (i % 2 == 0) {

            return true;

        }
        return false;
    }

    public static int MyCount(int a) {

        int count = 0;
        while (a > 0) {
            a = a / 10;
            count++;
        }
        return count;
    }

}
