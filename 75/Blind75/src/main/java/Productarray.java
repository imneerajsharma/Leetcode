import java.util.Arrays;

public class Productarray {
    public int[] productExceptSelf(int[] nums) {
        int n = nums.length;
        int ans[] = new int[n];
        Arrays.fill(ans, 1);
        int curr = 1;
        for (int i = 0; i < n; i++) {
            ans[i] *= curr;
            curr *= nums[i];
        }
        curr = 1;
        for (int i = n - 1; i >= 0; i--) {
            ans[i] *= curr;
            curr *= nums[i];
        }
        return ans;
    }

    public static void main(String[] args) {
        Productarray solution = new Productarray();
        int[] input = {1, 2, 3, 4};
        int[] result = solution.productExceptSelf(input);

        System.out.println("Input array: " + Arrays.toString(input));
        System.out.println("Output array: " + Arrays.toString(result));
    }
}
