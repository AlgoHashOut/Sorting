import java.util.Arrays;

public class QuickSortEx {

    public int[] sortArray(int[] nums) {

        quickSort(nums,0,nums.length-1);
        return nums;
    }

    private void quickSort(int[] nums, int leftIdx, int rightIdx)
    {
        int pivotIdx = partition(nums, leftIdx, rightIdx);
        if(leftIdx < pivotIdx-1)
        {
            quickSort(nums, leftIdx,pivotIdx-1);
        }

        if(rightIdx > pivotIdx)
        {
            quickSort(nums, pivotIdx,rightIdx);
        }
    }

    private int partition(int[] nums, int leftIdx, int rightIdx)
    {
        int midIdx = (leftIdx+rightIdx)/2;
        int pivotValue = nums[midIdx];

        while(leftIdx <= rightIdx)
        {
            while(nums[leftIdx] < pivotValue)
            {
                leftIdx++;
            }

            while(nums[rightIdx] > pivotValue)
            {
                rightIdx--;
            }

            if(leftIdx <= rightIdx)
            {
                int temp = nums[leftIdx];
                nums[leftIdx] = nums[rightIdx];
                nums[rightIdx] = temp;
                leftIdx++;
                rightIdx--;
            }
        }
        return leftIdx;
    }
    public static void main(String[] args) {
        QuickSortEx obj = new QuickSortEx();
        int[] input = new int[]{5, 2, 3, 1};
        System.out.println(" Before Sort ~~~" + Arrays.toString(input));
        obj.sortArray(input);
        System.out.println(" After Sort ~~~" + Arrays.toString(input));

    }
}
