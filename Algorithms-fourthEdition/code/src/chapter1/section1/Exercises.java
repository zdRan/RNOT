package chapter1.section1;

import edu.princeton.cs.algs4.StdOut;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

/**
 * Create by ranzd on 2019/7/18
 *
 * @author cm.zdran@gmail.com
 */
public class Exercises {
    public static void main(String[] args) throws IOException {
//        func1();
//        func2();
//        func3(args);
//        func5(1.0001, 0.0001);
//        func6();
//        func7a();
//        func7b();
//        func7c();
//        func8();
//        func12();
//        int[][] arr = new int[][]{
//                {1, 2, 3},
//                {4, 5, 6}
//        };
//        func13(arr);
//        int[] arr = new int[]{1, 2, 3, 2, 3};
//        func15(arr, 4);
//        StdOut.println(func16(6));
//        StdOut.println(func18(1,3));

//        long startTime = System.currentTimeMillis();
//        F(50);
//        StdOut.println(System.currentTimeMillis() - startTime);
//        int[] ans = new int[1000000];
//        StdOut.println(func19(ans, 10));
//        func21();
        int[] arr = new int[]{1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        System.out.println(rank(2, arr, 0, arr.length, 1));
    }

    private static void func1() {
        System.out.println((0 + 15) / 2);
        System.out.println(2.0e-6 * 100000000.1);
        System.out.println(true && false || true && true);
    }

    private static void func2() {
        double a = (1 + 2.236) / 2;
        System.out.println(a);
        double b = 1 + 2 + 3 + 4.0;
        System.out.println(b);
        boolean c = 4.1 >= 4;
        System.out.println(c);
        String d = 1 + 2 + "3";
        System.out.println(d);
    }

    private static void func3(String[] args) {
        if (args == null || args.length != 3) {
            return;
        }
        int num1 = Integer.valueOf(args[0]);
        int num2 = Integer.valueOf(args[1]);
        int num3 = Integer.valueOf(args[2]);
        if (num1 == num2 && num2 == num3) {
            System.out.println("equal");
        } else {
            System.out.println("not equal");
        }
    }

    private static void func5(double x, double y) {
        if ((0 < x && x < 1) && (0 < y && y < 1)) {
            System.out.println(true);
        } else {
            System.out.println(false);
        }
    }

    private static void func6() {
        int f = 0;
        int g = 1;
        for (int i = 0; i <= 15; i++) {
            StdOut.println(f);
            f = f + g;
            g = f - g;
        }
    }

    private static void func7a() {
        double t = 9.0;
        while (Math.abs(t - 9.0 / t) > .001) {
            t = (9.0 / t + t) / 2.0;
        }
        StdOut.printf("%.5f\n", t);
    }

    private static void func7b() {
        int sum = 0;
        for (int i = 0; i < 1000; i++) {
            for (int j = 0; j < i; j++) {
                sum++;
            }
        }
        StdOut.println(sum);
    }

    private static void func7c() {
        int sum = 0;
        for (int i = 1; i < 1000; i *= 2) {
            for (int j = 0; j < 1000; j++) {
                sum++;
            }
        }
        StdOut.println(sum);
    }

    private static void func8() {
        System.out.println('b');
        System.out.println('b' + 'c');
        System.out.println((char) ('a' + 4));
    }

    private static void func11(boolean[][] arr) {
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                StdOut.print(i + ":" + j + "->" + (arr[i][j] ? "*" : " "));
            }
            StdOut.println();
        }
    }

    private static void func12() {
        int[] a = new int[10];
        for (int i = 0; i < 10; i++)
            a[i] = 9 - i;
        for (int i = 0; i < 10; i++)
            a[i] = a[a[i]];
        for (int i = 0; i < 10; i++)
            System.out.println(i);
    }

    private static void func13(int[][] arr) {
        int[][] target = new int[arr[0].length][arr.length];
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                // target[i][j] -> arr[j][i]
                target[j][i] = arr[i][j];
            }
        }
        for (int[] aTarget : target) {
            for (int anATarget : aTarget) {
                StdOut.print(anATarget + ",");
            }
            StdOut.println();
        }
    }

    private static int func14(int N) {
        int k = 0;
        int M = 1;
        while (M < N) {
            M *= 2;
            k++;
        }
        return k - 1;
    }


    private static int[] func15(int[] arr, int M) {
        int[] result = new int[M];
        Arrays.fill(result, 0);
        for (int i = 0; i < arr.length; i++) {
            result[arr[i]] += 1;
        }
        for (int i = 0; i < result.length; i++) {
            StdOut.print(result[i] + ",");
        }
        return result;
    }

    private static String func16(int n) {
        if (n <= 0) return "";
        return func16(n - 3) + n + func16(n - 2) + n;
    }

    private static int func18(int a, int b) {
        if (b == 0) return 0;
        if (b % 2 == 0) return func18(a + a, b / 2);
        return func18(a + a, b / 2) + a;
    }

    private static int func19(int[] ans, int N) {
        if (N < 2) {
            ans[0] = 0;
            ans[1] = 1;
            return ans[N];
        }
        ans[N] = func19(ans, N - 1) + func19(ans, N - 2);
        return ans[N];
    }

    public static long F(int N) {
        if (N == 0) return 0;
        if (N == 1) return 1;
        return F(N - 1) + F(N - 2);
    }

    private static double func20(int N) {
        if (N == 1) {
            return 0.0;
        }
        return Math.log10(N) + func20(N - 1);
    }

    private static void func21() throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String line = null;
        while ((line = br.readLine()) != null) {
            if ("EOF".contains(line)) {
                return;
            }
            String[] arr = line.split(" ");
            StdOut.print(arr[0]+"\t");
            StdOut.print(arr[1]+"\t");
            StdOut.print(arr[2]+"\t");
            StdOut.printf("%.3f", Double.valueOf(arr[1]) / Double.valueOf(arr[2]));
            StdOut.println();
        }
    }

    private static int rank(int key, int[] arr, int lo, int hi,int deep) {
        if (lo > hi) {
            return -1;
        }
        int mid = lo + (hi - lo) / 2;
        StdOut.println(lo + ":" + hi + ":" + deep++);
        if (key < arr[mid]) {
            return rank(key, arr, lo, mid + 1,deep);
        }
        if (key > arr[mid]) {
            return rank(key, arr, mid, hi, deep);
        }
        return mid;
    }
}
