package medium;

import java.util.Arrays;

/**
 * 1503. 所有蚂蚁掉下来前的最后一刻
 * 有一块木板，长度为 n 个 单位 。一些蚂蚁在木板上移动，每只蚂蚁都以 每秒一个单位 的速度移动。其中，一部分蚂蚁向 左 移动，其他蚂蚁向 右 移动。

 当两只向 不同 方向移动的蚂蚁在某个点相遇时，它们会同时改变移动方向并继续移动。假设更改方向不会花费任何额外时间。

 而当蚂蚁在某一时刻 t 到达木板的一端时，它立即从木板上掉下来。

 给你一个整数 n 和两个整数数组 left 以及 right 。两个数组分别标识向左或者向右移动的蚂蚁在 t = 0 时的位置。请你返回最后一只蚂蚁从木板上掉下来的时刻。

 烟雾弹，只要找到离木板距离最远那只就行了
 */
public class T1503 {
    public static void main(String args[]){
        T1503 t = new T1503();
        System.out.println();
    }

    public int getLastMoment(int n, int[] left, int[] right) {
        int leftTime = 0;
        int rightTime = 0;
        if(left.length > 0){
            leftTime = Arrays.stream(left).max().getAsInt();
        }
        if(right.length > 0){
            rightTime = n - Arrays.stream(right).min().getAsInt();
        }
        return Math.max(leftTime, rightTime);
    }
}
