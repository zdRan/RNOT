package chapter1.section1;

/**
 * Create by ranzd on 2019/7/17
 *
 * @author cm.zdran@gmail.com
 */
public class Main {
    public static void main(String[] args) {
        //System.out.println(gcd(10, 5));
        int[] arr = new int[10];

        for (int i = 0; i < 10; i++) {
            arr[i] = i + 1;
        }

        System.out.println(BinarySearch.binarySearch(5, arr));
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
