import java.io.Console;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println(mergeOdds(1000));
    }

/*    public static int findPower(int number, int power){
        while(power > 0){
            number = number * 10;
            power = power -1;
        }
        return number;
    }

    public static int moveToEnd(int number){
        var firstDigit = number;
        var i = 0;
        while (firstDigit > 10) {
            i ++;
            firstDigit = firstDigit / 10;
        }
        int newNumber = number - findPower(firstDigit, i);
        var result = newNumber * 10 + firstDigit;
        return result;
    }*/

    public static int findPower(int number, int power){
        while(power > 0){
            number = number * 10;
            power = power -1;
        }
        return number;
    }

    public static int mergeOdds(int number){
        var i = 0;
        var k = 0;
        int result = 0;
        while (number > 0) {
            i ++;
            if (i % 2 == 1){
                result = result + findPower(number % 10, k );
                k ++;
            }
            number = number / 10;
        }
        return  result;
    }

}
