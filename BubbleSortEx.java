import java.util.Arrays;

public class BubbleSortEx {
    /*
        Time Complexity : O(n^2)
        Space Complexity: O(1)
     */
    public void sort(int[] nums)
    {
        for(int i = 0 ; i < nums.length; i++)
        {
            for(int j = 1 ; j < nums.length-i ; j++)
            {
                if(nums[j] < nums[j-1])
                {
                    int temp = nums[j-1];
                    nums[j-1] = nums[j];
                    nums[j] = temp;
                }
            }
        }
    }

    public static void main(String[] args) {
        BubbleSortEx obj = new BubbleSortEx();
        int[] input = new int[]{5,2,3,1};
        System.out.println(" Before Sort ~~~"+ Arrays.toString(input));
        obj.sort(input);
        System.out.println(" After Sort ~~~"+ Arrays.toString(input));

    }
}
