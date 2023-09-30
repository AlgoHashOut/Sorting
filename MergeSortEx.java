import java.util.Arrays;

public class MergeSortEx {

    public int[] sortArray(int[] nums) {
        return divide(nums);
    }

    private int[] divide(int[] nums) {

        int n = nums.length;
        if (n == 1) {
            return nums;
        }

        int[] leftArr = divide(Arrays.copyOfRange(nums, 0, n / 2));
        int[] rightArr = divide(Arrays.copyOfRange(nums, n / 2, n));

        int[] resultArr = conquer(leftArr, rightArr);

        return resultArr;
    }

    private int[] conquer(int[] leftArr, int[] rightArr) {
        int m = leftArr.length;
        int n = rightArr.length;
        int leftIdx = 0;
        int rightIdx = 0;
        int index = 0;
        int[] resultArr = new int[m + n];
        while (leftIdx < m && rightIdx < n) {
            if (leftArr[leftIdx] <= rightArr[rightIdx]) {
                resultArr[index] = leftArr[leftIdx];
                leftIdx++;
            } else {
                resultArr[index] = rightArr[rightIdx];
                rightIdx++;
            }
            index++;
        }

        while (leftIdx < m) {
            resultArr[index] = leftArr[leftIdx];
            index++;
            leftIdx++;
        }

        while (rightIdx < n) {
            resultArr[index] = rightArr[rightIdx];
            index++;
            rightIdx++;
        }

        return resultArr;

    }

    public static void main(String[] args) {
        MergeSortEx obj = new MergeSortEx();
        int[] input = new int[]{5, 2, 3, 1};
        System.out.println(" Before Sort ~~~" + Arrays.toString(input));
        int[] output = obj.sortArray(input);
        System.out.println(" After Sort ~~~" + Arrays.toString(output));

    }
}
