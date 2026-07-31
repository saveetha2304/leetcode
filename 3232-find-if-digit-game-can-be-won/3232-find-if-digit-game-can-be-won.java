class Solution {
    public boolean canAliceWin(int[] nums) {
        int singledigit=0;
        int doubledigit=0;
        for(int i=0;i<nums.length;i++){
            if(nums[i]>=0 && nums[i]<=9){
                singledigit=singledigit+nums[i];
            }
            else if(nums[i]>=10 && nums[i]<=99){
                doubledigit=nums[i]+doubledigit;
            }
        }
        if(singledigit>doubledigit || doubledigit>singledigit){
            return true;
        }
        
       
        return false;
    }
}