package MassivDvoinoy;

import java.util.Random;
import java.util.Scanner;

public class ArrayArray {
    public static void main(String[] args) {
        task1();
        task2();
        task3();
        task4();
        task5();
        task6();
        task8();
        task88();
        task888();
        task9();
    }

    //Задача 1 Найти минимальный элемент массива
    public static void task1() {
        int n = 5;
        int m = 6;
        int [][]arr = inputArray(n, m, 0, 30);
        printArray(arr, n, m);

        int min = arr[0][0];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                if (arr[i][j] < min)
                    min = arr[i][j];
            }
        }
        System.out.println("min=" + min);
    }

    //Задача 2 Найти максимальный элемент массива
    public static void task2() {
        int n = 5;
        int m = 6;
        int [][]arr = inputArray(n, m, 0, 30);
        printArray(arr, n, m);

        int max = arr[0][0];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                if (arr[i][j] > max)
                    max = arr[i][j];
            }
        }
        System.out.println("max=" + max);
    }

    // Задача 3 Найти индекс минимального элемента массива
    public static void task3() {
        int n = 5;
        int m = 6;
        int [][]arr = inputArray(n, m, 0, 30);
        printArray(arr, n, m);

        int min = arr[0][0];
        int mini = 0;
        int minj = 0;
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                if (arr[i][j] < min) {
                    min = arr[i][j];
                    mini = i;
                    minj = j;
                }
            }
        }
        System.out.println("indexMin= " + mini + " , " + minj);
    }

    //Задача 4 Найти индекс максимального элемента массива
    public static void task4() {
        int n = 5;
        int m = 6;
        int [][]arr = inputArray(n, m, 0, 30);
        printArray(arr, n, m);
        int max = arr[0][0];
        int maxi = 0;
        int maxj = 0;
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                if (arr[i][j] > max) {
                    max = arr[i][j];
                    maxi = i;
                    maxj = j;
                }
            }
        }
        System.out.println("IndexMax= " + maxi + " , " + maxj);
    }

    //Задача 5 Найти количество элементов массива, которые больше всех своих соседей одновременно
    public static void task5() {
        int n = 5;
        int m = 6;
        int [][]arr = inputArray(n, m, 0, 30);
        printArray(arr, n, m);
        boolean check;
        int count = 0;
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                check = true;
                for (int f = i - 1; f <= i + 1; f++) {
                    for (int k = j - 1; k <= j + 1; k++) {
                        if (f >= 0 && f < n && k >= 0 && k < m && !(f == i && k == j)) {
                            if (arr[f][k] >= arr[i][j]) {
                                check = false;
                                break;
                            }
                        }
                    }
                }
                if (check) {
                    count++;
                    System.out.println(count + "number = " + arr[i][j]);
                    System.out.println("Index: " + i + " " + j);
                }
            }
        }
        if (count == 0) {
            System.out.println("no numbers");
        }
    }

    public static void task55() {
        int n = 5;
        int m = 6;
        int [][]arr = inputArray(n, m, 0, 30);
        printArray(arr, n, m);
        int count = 0;
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                if (isLocalMax(arr, n, m, i, j)) {
                    count++;
                    System.out.println(count + "number = " + arr[i][j]);
                    System.out.println("Index: " + i + " " + j);
                }
            }
        }
        if (count == 0) {
            System.out.println("No numbers");
        }
    }

    public static boolean isLocalMax(int[][] arr, int n, int m, int i, int j) {
        int startI = i > 0 ? i - 1 : 0;
        int endI = i < n - 1 ? i + 1 : n - 1;
        int startJ = j > 0 ? j - 1 : 0;
        int endJ = j < m - 1 ? j + 1 : m - 1;
        for (int f = startI; f <= endI; f++) {
            for (int k = startJ; k <= endJ; k++) {
                if (!(f == i && k == j)) {
                    if (arr[f][k] >= arr[i][j]) {
                        return false;
                    }
                }
            }
        }
        return true;
    }

    //Задача 6 Отразите массив относительно его главной диагонали
    public static void task6() {
        int n = 6;
        int m = 6;
        int temp;
        int [][]arr = inputArray(n, m, 0, 30);
        printArray(arr, n, m);
        for (int i = 1; i < n; i++) {
            for (int j = 0; j < i; j++) {
                temp = arr[i][j];
                arr[i][j] = arr[j][i];
                arr[j][i] = temp;
            }
        }
        System.out.println();
        printArray(arr, n, m);
    }

    //Задача 8 сумма элементов строк
    public static void task8() {
        int n = 5;
        int m = 6;
        int [][]arr = inputArray(n, m, 0, 30);
        printArray(arr, n, m);
        int []a = new int[m];
        int sum = 0;
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                sum += arr[i][j];
                a[i] = arr[i][j];
                a[i] = sum;
            }
            sum = 0;
            System.out.println("sum=" + a[i]);
        }
    }

    //Задача 8 произведение элементов строк
    public static void task88() {
        int n = 5;
        int m = 6;
        int [][]arr = inputArray(n, m, 0, 30);
        printArray(arr, n, m);
        int []a = new int[m];
        int mult = 1;
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                mult *= arr[i][j];

                a[i] = arr[i][j];
                a[i] = mult;
            }
            mult = 1;
            System.out.println("multiplication=" + a[i]);
        }
    }

    public static void task888() {
        int n = 5;
        int m = 6;
        int [][]arr = inputArray(n, m, 0, 30);
        printArray(arr, n, m);
        int []a = new int[m];
        int sum = 0;
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                sum += arr[i][j];
                a[i] = arr[i][j];
                a[i] = sum / m;
            }
            sum = 0;
            System.out.println(a[i]);
        }
    }

    //Задача 9
    public static void task9() {
        int n =5;
        int m = 6;
        int arr[][] = inputArray(n, m, 0, 30);
        boolean result = true;
        boolean check;
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                check = true;
                for (int k = 0; k < n; k++) {
                    if (arr[k][j] >= arr[i][j] && k != i) {
                        check = false;
                        break;
                    }
                }
                for (int t = 0; t < m; t++) {
                    if (arr[i][t] <= arr[i][j] && t != j) {
                        check = false;
                        break;
                    }
                }
                if (check) {
                    result = false;
                    System.out.println("Array" + arr[i][j] + " with index " + i + " " + j);
                }
            }
        }
        if (result) {
            System.out.println("No Numbers");
        }
    }


    public static int[][] inputArray(int n, int m, int a, int b) {
        Random random = new Random();
        int arr[][] = new int[n][m];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                arr[i][j] = random.nextInt(a, b);
            }
        }
        return arr;
    }

    public static void printArray(int[][] arr, int n, int m) {
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }
    }


}