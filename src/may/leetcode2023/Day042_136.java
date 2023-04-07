 class Day040_1039 { 
 public int singleNumber(int[] nums) {
        int a = 1000000000;
        int len = nums.length;
        int t= 0;
        if (len == 1) {
            return nums[0];
        }

        for (int num : nums) {
            t ^= num;
        }
        return t;
    }
}