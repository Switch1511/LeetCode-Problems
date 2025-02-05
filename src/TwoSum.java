import java.util.HashMap;
import java.util.Map;

public class TwoSum {
    public static int[] twoSum(int[] nums, int target) {
        Map<Integer, Integer> map = new HashMap<>();

        for (int x = 0; x < nums.length; x++) {
            int complement = target - nums[x];
            if (map.containsKey(complement)) {
                return new int[]{x, map.get(complement)};
            }
            map.put(nums[x], x);
        }
        return new int[]{};
    }

    public static void main(String[] args) {
        int[] result = twoSum(new int[]{2, 7, 11, 15}, 9);
        System.out.println("[" + result[0] + ", " + result[1] + "]");
    }
}