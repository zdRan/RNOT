package chapter1.section1;

/**
 * Create by ranzd on 2019/7/17
 *
 * @author cm.zdran@gmail.com
 */
public class BinarySearch {

    public static int binarySearch(int key, int[] array) {
        return rankByWhile(key, array, 0, array.length - 1);
    }

    /**
     * 二分查找算法，递归版
     *
     * @param key
     * @param arr
     * @param lo
     * @param hi
     * @return
     */
    private static int rank(int key, int[] arr, int lo, int hi) {
        if (lo > hi) {
            return -1;
        }
        int mid = lo + (hi - lo) / 2;
        if (key < arr[mid]) {
            return rank(key, arr, lo, mid + 1);
        }
        if (key > arr[mid]) {
            return rank(key, arr, mid, hi);
        }
        return mid;
    }

    /**
     * 二分查找 非递归版
     *
     * @param key
     * @param arr
     * @param lo
     * @param hi
     * @return
     */
    private static int rankByWhile(int key, int[] arr, int lo, int hi) {
        while (lo <= hi) {
            int mid = lo + (hi - lo) / 2;
            if (key == arr[mid]) {
                return mid;
            }
            if (key < arr[mid]) {
                hi = mid - 1;
            } else {
                lo = mid + 1;
            }
        }
        return -1;
    }


}
