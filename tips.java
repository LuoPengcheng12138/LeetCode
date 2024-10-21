//二分查找闭区间写法
private int lowerBound(int[] nums, int target) {
    int left = 0, right = nums.length - 1; // 闭区间 [left, right]
    while (left <= right) { // 区间不为空
        // 循环不变量：
        // nums[left-1] < target
        // nums[right+1] >= target
        int mid = left + (right - left) / 2;
        if (nums[mid] < target) {
                left = mid + 1; // 范围缩小到 [mid+1, right]
        } else {
                right = mid - 1; // 范围缩小到 [left, mid-1]
        }
    }
    return left;
}



//向上/向下取整

//1、四舍五入：Math.round（result）; 
//2、向上取整 ：Math.ceil(result); 或者 (base + div - 1) / div
//3、向下取整 ：Math.floor(result);



//正序/逆序排序

//数组升序
Arrays.sort(nums);
//数组降序 -> Comparator中的类型是Integer，排序的数组也只能是Integer类型，不能够是int类型
Integer[] arr = {1,5,8,4,2,6,4};
Arrays.sort(arr, new Comparator<Integer>()
{
    @Override
    public int compare(Integer o1, Integer o2) {
        return o2-o1;
    }
});