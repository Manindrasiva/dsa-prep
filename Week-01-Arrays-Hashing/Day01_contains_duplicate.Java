import java.util.HashSet;
import java.util.Set;

class Day01_contains_duplicate {

        public static boolean containsDuplicate(int[] nums) {
                Set<Integer> hs = new HashSet<>();
                for (int num : nums) {
                        // Check if element is already present
                        if (hs.contains(num)) {
                                return true;
                        }
                        // Add element to the set
                        hs.add(num);
                }
                return false;
        }

        public static void main(String[] args) {
                int[] test1 = {1, 2, 3, 1};
                int[] test2 = {1, 2, 3, 4};

                System.out.println("Test 1: " + containsDuplicate(test1)); // true
                System.out.println("Test 2: " + containsDuplicate(test2)); // false
        }
}
