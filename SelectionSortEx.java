import java.util.Arrays;

public class SelectionSortEx {
    /*
        Time Complexity : O(n^2)
        Space Complexity: O(1)
     */
    public void sort(int[] nums)
    {
        int smallIndex;
        for(int index = 0 ; index < nums.length; index++)
        {
            smallIndex = index;
            for(int nextIndex = index+1 ; nextIndex < nums.length ; nextIndex++)
            {
                if(nums[nextIndex] < nums[smallIndex])
                {
                    smallIndex = nextIndex;

                }
            }
            if(index != smallIndex)
            {
                int temp = nums[index];
                nums[index] = nums[smallIndex];
                nums[smallIndex] = temp;
            }
        }
    }

    public static void main(String[] args) {
        SelectionSortEx obj = new SelectionSortEx();
        int[] input = new int[]{5,1,1,2,0,0};
        System.out.println(" Before Sort ~~~"+ Arrays.toString(input));
        obj.sort(input);
        System.out.println(" After Sort ~~~"+ Arrays.toString(input));

    }
}
