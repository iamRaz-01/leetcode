class Solution {
    public int minimumSum(int[] nums) {
        int minMountainSum = -1;
        int n =  nums.length ;
        for(int i = 0 ; i <n ;i++ )
        for(int j = i+1 ; j <n;j++)
        for (int k =j+1 ; k<n ; k++){
            if((nums[i]<nums[j])&&(nums[j]>nums[k])) {
                int sum = nums[i]+nums[j]+nums[k];

                minMountainSum =(minMountainSum == -1)?sum:Math.min(sum,minMountainSum);
            }

        }
        return minMountainSum;
    }
}