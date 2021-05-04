import java.util.Scanner;

public class Main {

    public static void main(String[] args) {


//        System.out.println("1-1000 arasi eded daxil edin");
//        Scanner scanner = new Scanner(System.in);
//        int a = scanner.nextInt();
//        if (a > 1 && a < 1000) {
//            for (int i = 1; i <= a; i++) {
//                if (i % 5 == 0 && sumNum(i) % 5 == 0) {
//                    System.out.println(i);
//                }
//            }
//        } else {
//            System.out.println("Yanlish eded");
//        }

//        System.out.println(firstElem(52345));
//        System.out.println(numOfElem(23456));
//        System.out.println(powerOfElem(2, 3));
//        System.out.println(firstToLast(7234345));

        System.out.println(powerOfElem(2, 5));
        System.out.println(findIndexElem(234, 3));
        System.out.println(lastElem(234));
        System.out.println(oddIndexNum(233784456));


    }

    /*  public static int sumNum(int num) {
          int sum = 0;
          while (num > 0) {
              sum += (num % 10);
              num = num / 10;
          }
          return sum;
      }
  */

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


}

