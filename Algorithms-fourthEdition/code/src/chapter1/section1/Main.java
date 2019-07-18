package chapter1.section1;

/**
 * Create by ranzd on 2019/7/17
 *
 * @author cm.zdran@gmail.com
 */
public class Main {
    public static void main(String[] args) {
        gcd(12, 4);
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
}
