
public class twoSum {

	   
    
    public static int twoSum(int[] nums, int target) {
    	int len = nums.length;
        for(int i=0;i<len;i++){
            for(int j=0;j<len;j++){
                if(nums[i]!= nums[j] && nums[i]+nums[j]==target){
                   System.out.println("Positions are" + i +" , "+j+ "  values are"+nums[i]+" , "+nums[j]);
                   return 1;
                }
            }
        }
        return 0;
    }
    
    public static void main(String []args){
    	int[] nums = {2,7,11,15};
 	    int target = 26;
        int result=twoSum(nums,target);
        if(result == 1){
            System.out.println("Match found");
        }
        else{
            System.out.println("Match not found");
        }
        
    }


}
