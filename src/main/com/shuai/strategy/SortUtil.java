package main.com.shuai.strategy;

/**
 * @description:
 * @author: LISHUAI
 * @createDate: 2021/4/14
 * @version: 1.0
 */
public class SortUtil<T> {

    private void sort(T[] arr, int lo, int hi, Comparator comparator) {
        if (hi <= lo)  //   当起始下标和结束下标相等时，数组只有一个元素，天然有序
            return;
        int j = partition(arr, lo, hi, comparator);     // 拆分数组，返回分割元素的下标
        sort(arr, lo, j - 1, comparator);   //  对左子数组进行拆分排序
        sort(arr, j + 1, hi, comparator);   //  对右子数组进行差分排序
    }

    private int partition(T[] arr, int lo, int hi, Comparator comparator) {
        int i = lo, j = hi + 1;     //  i作为左指针，从左侧开始遍历数组。 j作为右指针，从右侧开始遍历数组
        T v = arr[lo];    //  使用数组的第一个元素作为分割元素
        while (true) {
            while (comparator.compare(arr[++i], v) < 0) if (i == hi) break;    //  从左侧开始查找大于分割元素的数组元素
            while (comparator.compare(arr[--j], v) > 0) /*if (j == lo) break*/ ;    //  从右侧开始查找小于分割元素的数组元素
            if (i >= j) break;  //  当左右指针相遇时，就是遍历一边数组结束。此次拆分结束
            //  将左侧寻找到的大于分割元素的数组元素和右侧寻找到的小于分割元素的数组元素，交换位置。
            //  使小于分割元素或大于分割元素的数组元素各处于数组的一侧
            less(arr, i, j);
//            write(arr, v, lo, hi, i, j, false);
        }
        less(arr, lo, j);   //  遍历一边数组之后将分割元素放到合适的位置。使分割元素的左侧都小于分割元素，右侧都大于分割元素
//        write(arr, v, lo, hi, lo, j, true);
//        write();
//        writeX(arr);
        return j;
    }

    private void less(T[] arr, int lo, int hi) {
        if (lo >= hi || lo < 0 || hi >= arr.length)
            return;
        T t = arr[lo];
        arr[lo] = arr[hi];
        arr[hi] = t;
    }

    public void sort(T[] arr, Comparator comparator) {
        sort(arr, 0, arr.length - 1, comparator);
    }
}
