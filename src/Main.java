import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Введите размер массива: ");
        int length = in.nextInt();
        int num[] = new int[length];
        System.out.print("Заполните массив: ");

        for (int i = 0; i < length; i++) {
            num[i] = in.nextInt();
        }

        System.out.print(SortingArray(num));
    }

    public static boolean SortingArray(int[] num) {
        int sumRight = 0;
        int sumLeft = 0;
        int[] leftNum = new int[num.length];
        int[] rightNum = new int[num.length];
        for (int i = 0; i < num.length; i++) {
            sumLeft = sumLeft + num[i];
            sumRight = sumRight + num[num.length-i-1];
            leftNum[i] = sumLeft;
            rightNum[num.length-i-1] = sumRight;
        }
        for (int j = 0; j < num.length -1; j++) {
            if (leftNum[j] == rightNum[j+1])
                return true;
        }
        return false;
    }
}