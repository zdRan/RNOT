package chapter1.section1;

import edu.princeton.cs.algs4.StdOut;

/**
 * Create by ranzd on 2019/7/17
 *
 * @author cm.zdran@gmail.com
 */
public class Main {
    public static void main(String[] args) {
        compareXY(0.000001,1.00000001);
        func();
    }

    /**
     * 求两个非负整数的最大公约数
     *
     * @param p
     * @param q
     * @return
     */
    private static int gcd(int p, int q) {
        return q == 0 ? p : gcd(q, p % q);
    }

    private static void compareXY(double x, double y) {
        if ((0 < x && x < 1) && (0 < y && y < 1)) {
            System.out.println(true);
        } else {
            System.out.println(false);
        }
    }

    private static void func(){
        int f = 0;
        int g = 1;
        for (int i = 0; i <= 15; i++) {
            StdOut.println(f);
            f = f + g;
            g = f - g;
        }
    }
}
