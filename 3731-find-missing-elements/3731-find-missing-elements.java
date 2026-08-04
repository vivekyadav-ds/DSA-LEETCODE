class Solution {
    public List<Integer> findMissingElements(int[] nums) {

        Arrays.sort(nums);

        List<Integer> ans = new ArrayList<>();
        int n = nums.length;

        int prev = nums[0];

        for (int i = 1; i < n; i++) {

            while (nums[i] != prev + 1) {
                ans.add(++prev);
            }

            prev = nums[i];
        }

        return ans;
    }
}