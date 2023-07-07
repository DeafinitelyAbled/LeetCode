public class RemoveElementSolution {
    // Please, open (copy & paste) the following link for the problem description:
    // https://leetcode.com/problems/remove-element/description/

    // Solution 1
    public static int removeElement1(int[] nums, int val) {
        int index = 0;
        for (int i = 0; i < nums.length; ++i) {
            if (nums[i] != val) {
                nums[index] = nums[i];
                ++index;
            }
        }
        return index;
    }

    // Solution 2
    public static int removeElement2(int[] nums, int val) {
		int firstIndex = 0;
		int lastIndex = nums.length - 1;

		boolean stop = false;
		while (!stop) {
			while (firstIndex <= lastIndex && nums[firstIndex] != val) {
				++firstIndex;
			}
			while (firstIndex <= lastIndex && nums[lastIndex] == val) {
				--lastIndex;
			}
			if (firstIndex >= lastIndex) {
				stop = true;
			}
			else {
				int temp = nums[firstIndex];
				nums[firstIndex] = nums[lastIndex];
				nums[lastIndex] = temp;
				++firstIndex;
				--lastIndex;
			}

		}

		return firstIndex;
    }

    public static void main(String[] args) {

        // Test 1:
        int[] nums = { 3, 2, 2, 3 };
        int val = 3;

        int k = removeElement1(nums, val);
        for (int i = 0; i < k; ++i) {
            System.out.print(nums[i] + " ");
        }

        System.out.println();

        // Test 2:
        int[] numbers = { 0, 1, 2, 2, 3, 0, 4, 2 };
        int value = 2;

        int l = removeElement2(numbers, value);
        for (int i = 0; i < l; ++i) {
            System.out.print(numbers[i] + " ");
        }

    }
}
