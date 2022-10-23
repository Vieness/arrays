import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        // TASK 0

        for (int i = 1; i <= 10; i++) {
            for (int j = 1; j <= 10; j++) {
                System.out.println(i + " * " + j + " = " + j * i);
            }
        }

        //TASK 1
        //FOR
        int sum = 0;
        for (int i = 0; i <= 150; i++) {
            if (i % 5 == 0) {
                sum += i;
            }
        }
        System.out.println(sum);

        //TASK 2
        int n = 6;

        for (int i = 0; i < n; i++) {
            for (int j = 0; j <= i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
        //TASK 3
        char[] arrayChar = new char[32];
        int count = 0;
        for (char i = 'а'; i <= 'я'; i++) {
            arrayChar[count] = i;
            System.out.print(arrayChar[count]);
            if (i != 'я') System.out.print(", ");
        }
        System.out.println();
        //TASK 4
        int[] arr = new int[5];
        Scanner scanner = new Scanner(System.in);
        for (int i = 0; i < arr.length; i++) {
            arr[i] = scanner.nextInt();
        }
        System.out.println(Arrays.stream(arr).max().getAsInt());
        //TASK 5
        int[][] arr2 = new int[11][11];
        for (int i = 0; i <= 10; i++) {
            for (int j = 0; j <= 10; j++) {
                arr2[i][j] = i * j;
            }
        }
        Scanner userScan = new Scanner(System.in);
        System.out.println("first num: ");
        int first = userScan.nextInt();
        System.out.println("second num: ");
        int second = userScan.nextInt();
        System.out.println("res: " + arr2[first][second]);
        //TASK 6
        int[] arrNumber1 = new Random().ints(0, 100).limit(5).toArray();
        int[] arrNumber2 = new Random().ints(0, 100).limit(5).toArray();
        int[] result = new int[5];
        for (int i = 0; i < 5; i++) {
            result[i] = Math.max(arrNumber1[i], arrNumber2[i]);
        }
        System.out.println("arr1: " + Arrays.toString(arrNumber1));
        System.out.println("arr2: " + Arrays.toString(arrNumber2));
        System.out.println("result: " + Arrays.toString(result));
    }
}