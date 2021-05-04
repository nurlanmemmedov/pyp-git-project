
public class Main {

    public static void main(String[] args) {

        System.out.println(powerOfElem(2, 5));
        System.out.println(findIndexElem(234, 3));
        System.out.println(lastElem(234));
        System.out.println(oddIndexNum(233784456));
    }
    public static int oddIndexNum(int num) {
        int result = 0;
        while (num > 10) {
            result += lastElem(num);
            result *= 10;
            num /= 100;
        }
        return result/10;
    }


    public static int firstToLast(int num) {
        return (num - firstElem(num) * powerOfElem(numOfElem(num) - 1, 10)) * 10 + firstElem(num);
    }


    public static int firstElem(int num) {
        while (num > 10) {
            num /= 10;
        }
        return num;
    }

    public static int lastElem(int num) {
        return num % 10;
    }

    public static int numOfElem(int num) {
        int i = 0;
        while (num > 0) {
            num /= 10;
            i++;
        }
        return i;
    }

    public static int findIndexElem(int num, int index) {
        num %= powerOfElem(index, 10);

        return num;

    }


    public static int powerOfElem(int power, int base) {
        int result = 1;
        for (int i = 0; i < power; i++) {
            result *= base;
        }
        return result;
    }

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

