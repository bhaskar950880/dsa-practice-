public class dublicatenumber {
    public int findDuplicate(int[] nums) {
        int slow = nums[0];
        int fast = nums[0];
        while (slow != fast) {
            slow = nums[slow];
            fast = nums[fast];
        }
        return slow;
    }
    
}
//287. Find the Duplicate Number leet code 
