package chapter1.section1;

import edu.princeton.cs.algs4.StdOut;

/**
 * Create by ranzd on 2019/7/18
 *
 * @author cm.zdran@gmail.com
 */
public class Exercises {
    public static void main(String[] args) {
//        func1();
//        func2();
//        func3(args);
//        func5(1.0001, 0.0001);
//        func6();
//        func7a();
//        func7b();
//        func7c();
        func8();
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
    private static void func7c(){
        int sum = 0;
        for (int i = 1; i < 1000; i *= 2) {
            for (int j = 0; j < 1000; j++) {
                sum++;
            }
        }
        StdOut.println(sum);
    }
    private static void func8(){
        System.out.println('b');
        System.out.println('b'+'c');
        System.out.println((char) ('a' + 4));
    }
}
