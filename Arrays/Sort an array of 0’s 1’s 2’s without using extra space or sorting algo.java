class Solution {
    private void swap(int[] nums,int i,int j){
        int temp=nums[i];
        nums[i]=nums[j];
        nums[j]=temp;
    }
    
    public void sortColors(int[] nums) {
        
        int i=0,j=nums.length-1,mid=0;
        while(mid<=j)
        {
            if(nums[mid]==1){
                mid++;
            }
            else if(nums[mid]==0){
                swap(nums,i,mid);
                i++;
                mid++;
            }
            else if(nums[mid]==2){
                swap(nums,j,mid);
                    j--;
            }
        }
    }
}