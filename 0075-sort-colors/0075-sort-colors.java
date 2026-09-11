class Solution {
    public void sortColors(int[] nums) {
        int left=0;
        int mid=0;
        int last=nums.length-1;
        while(mid<=last)
        {
            if(nums[mid]==0)
            {
                int temp=nums[mid];
                nums[mid]=nums[left];
                nums[left]=temp;
                mid++;
                left++;
            }
            else if(nums[mid]==1)
            {
                mid++;
            }
            else
            {
                int temp=nums[mid];
                nums[mid]=nums[last];
                nums[last]=temp;
                last--;
            }
        }
    }
}