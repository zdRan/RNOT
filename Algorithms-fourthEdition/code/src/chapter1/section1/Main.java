package chapter1.section1;

/**
 * Create by ranzd on 2019/7/17
 *
 * @author cm.zdran@gmail.com
 */
public class Main {
    public static void main(String[] args) {
        //System.out.println(gcd(10, 5));
        int[] arr = new int[11];

        for (int i = 0; i < 11; i++) {
            arr[i] = i + 1;
        }

        System.out.println(binarySearch(5, arr, 0, 10));

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

    /**
     * 二分查找算法
     *
     * @param key
     * @param arr
     * @param lo
     * @param hi
     * @return
     */
    private static int binarySearch(int key, int[] arr, int lo, int hi) {
        if (lo > hi) {
            return -1;
        }
        int mid = lo + (hi - lo) / 2;
        if (key < arr[mid]) {
            return binarySearch(key, arr, lo, mid + 1);
        }
        if (key > arr[mid]) {
            return binarySearch(key, arr, mid, hi);
        }
        return mid;

    }
}
